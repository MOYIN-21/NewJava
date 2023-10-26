package Chapter15.FIlesIO.InputSream;

import java.io.FileReader;

public class FileReaderSample {
    public static void main(String[] args) {
        char[] data = new char[1000];
        try (FileReader fileReader = new FileReader("moyin.txt")) {
            int numberOfBytesRead = fileReader.read(data);
            for (char ch : data) {
                System.out.println(ch);
            }
        System.out.println(numberOfBytesRead);
    }catch (Exception exception){
            System.err.println(exception.getMessage());

            }

        }
    }
