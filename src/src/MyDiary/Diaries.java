package src.MyDiary;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

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
        String user = userName;
        Diary diary = new Diary(user, password);
        diaries.add(diary);
    }

}
