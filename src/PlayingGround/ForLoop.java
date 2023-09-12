package PlayingGround;

public class ForLoop {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.printf("%s%8s%n", "Index", "Value");
        for (int counter = 0; counter < array.length; counter++) {
            System.out.printf("%5d%8d%n", counter, array[counter]);
        }
        for (int i = 0; i <= 9; i++) {
            int num = i + 1;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 2; i<=10; i++){
            int num = i * 2;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i <=10; i++){
            int num = i*3;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *4;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *5;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *6;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *7;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *8;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *9;
            System.out.print(num + " ");
        }
        System.out.println();
        for(int i = 1; i<=10; i++){
            int num = i *10;
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for(int i = 1; i < 11; i++){
            for(int j = 1; j <=10; j++){
                System.out.print((i*j) + " ");
            }
            System.out.println();
        }

    }
}

