package Chapter15.FIlesIO.OutPut;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import static java.lang.System.out;

public class PrintStreamSample {
    public static void main(String[] args) {
        try{
        System.setOut(new PrintStream(new FileOutputStream("printStream.txt")));
            out.println("I am tired");
        }catch (FileNotFoundException e){
            out.println(e.getMessage());
        }
    }
}
