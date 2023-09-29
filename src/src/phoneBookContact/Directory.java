package src.phoneBookContact;

public class Directory {


    private int id;
    private final String name;
    private final String address;
    private final String telephone;
    private final String email;

    public Directory(int id, String name, String address, String telephone, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getEmail() {
        return email;
    }

    public String getDirectory() {
        return name + " " + address + " " + telephone + " " + email;
    }

}
