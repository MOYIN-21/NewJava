package Chapter15.FIlesIO;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {
    String[] names = {"Tola", "Dorcas", "Taiwo", "Sam"};
    BufferedWriter writer;{
        try {
            writer = new BufferedWriter(new FileWriter("moyin.txt"));
            writer.write("Writing into my first file");
            writer.write("\nI am happy");

            for(String name: names){
                writer.write("\n" + name);
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
