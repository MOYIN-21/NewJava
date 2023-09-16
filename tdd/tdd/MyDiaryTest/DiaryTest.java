package tdd.MyDiaryTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import src.MyDiary.Diary;
import src.MyDiary.Entry;

public class DiaryTest {

    public  Diary diary;

    @BeforeEach
    public void startWith(){
        diary = new Diary("Ola","0");
        diary.lockDiary();
        Assertions.assertTrue(diary.isLocked());
    }

    @Test
    public void diaryCanBeCreatedTest() {
        Assertions.assertNotNull(diary);
}

    @Test
    public void unLockedDiaryTest(){
        diary.lockDiary();
        Assertions.assertTrue(diary.isLocked());
        diary.unLocked("0");
        Assertions.assertFalse(diary.isLocked());
    }

    @Test
    public void LockDiaryTest(){
        diary.lockDiary();
        Assertions.assertTrue(diary.isLocked());
    }

    @Test
    public void diaryCanCreateEntryTestTest(){
        diary.unLocked("0");
        Assertions.assertFalse(diary.isLocked());
        diary.createEntry(1,"Dream","life");
        Assertions.assertEquals(new Entry(1,"Dream","life").getEntry(), diary.findEntry(1).getEntry());
    }

    @Test
    public void deleteEntryTest(){
        diary.unLocked("0");
        Assertions.assertFalse(diary.isLocked());
        diary.createEntry(1,"dear precious","Submit assignment for me");
        diary.createEntry(2,"dear diary","School");

        Assertions.assertEquals(new Entry(1,"dear precious","Submit assignment for me").getEntry(), diary.findEntry(1).getEntry());
        Assertions.assertEquals(new Entry(2,"dear diary","School").getEntry(), diary.findEntry(2).getEntry());

        diary.deleteEntry(1);
        Assertions.assertEquals(1, diary.getSize());
    }

    @Test
    public void updateEntryTest(){
        diary.unLocked("0");
        Assertions.assertFalse(diary.isLocked());
        diary.createEntry(1, "love","school");
        diary.createEntry(2, "love","school");

        Assertions.assertEquals(new Entry(1,"love","school").getId(), diary.findEntry(1).getId());
        Assertions.assertEquals(new Entry(2,"love","school").getId(), diary.findEntry(2).getId());

        diary.updateEntry(2,"love1","school1");
        String check = diary.findEntry(2).getEntry();
        Assertions.assertEquals("2 love1 school1", check);
    }
}
