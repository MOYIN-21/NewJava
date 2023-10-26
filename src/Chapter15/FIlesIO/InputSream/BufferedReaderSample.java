package Chapter15.FIlesIO.InputSream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;

public class BufferedReaderSample {
    public static void main(String[] args) {
        try (var inputStreamReader = new InputStreamReader(in);
                BufferedReader reader = new BufferedReader(inputStreamReader)){
            System.out.println("Enter anything");
            String data = reader.readLine();
            System.out.println("Hello, you have entered" + data);
        }catch (IOException exception){
            System.err.println(exception.getMessage());
        }
    }
}
