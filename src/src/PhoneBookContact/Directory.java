package src.PhoneBookContact;

public class Directory {


    private int id;
    private final String name;
    private final String address;
    private final String telephone;
    private final String email;

    public Directory(int id, String name, String address, String telephone, String email){
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public String getDirectory() {
        return name + " " + address + " " + telephone + " " + email;
    }
    public int getId(){
        return id;
    }
    public void setID(int id){
        this.id = id;
    }
}
