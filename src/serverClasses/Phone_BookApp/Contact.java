package serverClasses.Phone_BookApp;

public class Contact {

    private String emailAddress;
    private String phoneNumber;
    private static String contactName;

    public Contact(String contactName, String phoneNumber, String emailAddress, String address){
        this.contactName = contactName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress){
        this.emailAddress = emailAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public static String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName){
        this.contactName = contactName;
    }
}
