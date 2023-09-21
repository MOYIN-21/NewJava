package src;

public class Menstrual {
    private String password;
    private boolean isLock;


    public Menstrual(String password){
        this.password = password;
    }
    public void lockApp() {
        this.isLock = true;
    }
    public boolean isLock() {
        if(isLock);
        if (!password.equals(password)){
            throw new IllegalArgumentException("Password not correct, try again");
        }
        return isLock;
    }

    public void unLockApp(String userPassword) {
        if(isLock);
        if (!password.equals(userPassword)){
            throw new IllegalArgumentException("Password not correct, try again");
        }
        this.isLock = false;

    }

    public void lastPeriodDate() {
    }

    public void cycleLength() {

    }
}

