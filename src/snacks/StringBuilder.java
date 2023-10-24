package snacks;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder usb = new java.lang.StringBuilder("Moyin");

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
