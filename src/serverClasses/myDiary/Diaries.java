package serverClasses.myDiary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private final List<Diary> diaries = new ArrayList<>();

    public void addUser(String username, String password){
        Diary diary = new Diary(username, password);
        diaries.add(diary);
    }

    public Diary findByUserName(String userName){
        for (Diary diary: diaries) {
            if (diary.getUserName().equals(userName))
                return diary;
            }
        throw new IllegalArgumentException("User name not found");
    }

    public void delete(String userName, String password){
        Diary diary = new Diary(userName, password);
        diaries.remove(diary);
    }
}
