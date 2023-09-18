package src.PhoneBookContact;


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Objects;

public class PhoneBook {
    private String password;
    private final List<Directory> phoneBook;
    private int Directory;
    private int id;
    private final String userName;
    public PhoneBook(String userName, String password){
        this.password = password;
        this.userName = userName;
        phoneBook = new ArrayList<>();
    }


    private boolean isLocked;

    public void unLocked(String userPassword) {
        if(!Objects.equals(userPassword, password)){
            throw new InputMismatchException("Incorrect Password");
        }else
            this.isLocked = false;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void locked() {
        isLocked = true;
    }

    public void createDirectory(int id, String name, String address, String telephone, String email) {
        Directory directory = new Directory(id, name, address,telephone,email);
        phoneBook.add(directory);

    }

    public Directory findDirectory(int id) {
        for (Directory directory:phoneBook) {
            if(directory.getId() == id){
                return directory;
            }
        }
        throw new NullPointerException("Directory not found");
    }

    public void createPhoneBook(String username, String password) {

    }

    public void deleteDirectory(int userId) {
        if (!isLocked && Objects.equals(userId, id)) {
            int directoryId = findDirectory(id).getId();
            phoneBook.remove(directoryId - 1);
        }
    }
    public String getUserName() {
        return userName;
    }

    public int getSize() {
        return phoneBook.size();
    }
}
