package snacks;

public class StringBuild {
    public static void main(String[] args) {
        StringBuilder usb = new StringBuilder("Moyin");

        usb.append("tola");
        System.out.println(usb);


        usb.deleteCharAt(5);
        System.out.println(usb);


        usb.replace(0,4, "monoj");
        System.out.println(usb);


        usb.reverse();
        System.out.println(usb);


        usb.insert(0,"Ola");
        System.out.println(usb);


        usb.delete(2, 3);
        System.out.println(usb);
    }
}
