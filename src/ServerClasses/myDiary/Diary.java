package ServerClasses.myDiary;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Diary {

    private final String userName;
    private final String password;
    private boolean isLocked;
    private final List<Entry> diary;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
        this.diary = new ArrayList<>();
    }
    public void unLocked(String userPassword) {
        if (!Objects.equals(userPassword, this.password)) {
            throw new NullPointerException("wrong pin");}
        else {
            isLocked = false;
        }
    }
    public List<Entry> list(){
        return diary;
    }
    public void createEntry(int id,String title, String body) {
        Entry entry = new Entry(id,title,body);
        diary.add(entry);
    }

    public String getUserName(){
        return userName;
    }

    public void lockDiary() {
        isLocked = true;
    }
    public boolean isLocked()throws IllegalArgumentException{
        if(isLocked)
            validate_Password(password);
        return isLocked;
    }

    public Entry findEntry(int id) {
        for (Entry entry : diary) {
            if (entry.getId() == id) {
                return entry;
            }
        }
        throw new NullPointerException("Entry not found");

    }

    public void deleteEntry(int id){
        if ( !isLocked){
            int entryId = findEntry(id).getId();
            diary.remove(entryId-1);
        }
    }

    public void updateEntry(int id, String title, String body){
        Entry entry = findEntry(id);
        entry.setId(id);
        entry.setTitle(title);
        entry.setBody(body);
    }

    public void validate_Password(String userPassword){
        if (!Objects.equals(password, userPassword)){
            throw new IllegalArgumentException("INCORRECT PASSWORD");
        }
    }

    public int getSize() {
        return diary.size();
    }
}

