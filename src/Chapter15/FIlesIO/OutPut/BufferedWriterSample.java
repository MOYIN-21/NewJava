package Chapter15.FIlesIO.OutPut;
import java.io.*;
import static java.lang.System.out;

public class BufferedWriterSample {
    public static void main(String[] args) {
        try (BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(out)
        )) {
                writer.write("Y'hello. Africa");
            } catch(IOException exception){
                out.println();
            }
        }
    }

