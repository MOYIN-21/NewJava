package ServerClasses.girlChoice;

public class Girl {
    private BoyFriend boyFriend;


    public Girl(BoyFriend boyFriend) {
        this.boyFriend = boyFriend;
    }

    public void spend() {
        boyFriend.spend();
    }
}
