package Chapter15.FIlesIO.OutPut;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ExampleJavaNio {
    public static void main(String[] args) {
        String location = "/home/moyin/Downloads/JavaJava/src/FIlesIOStreamXML/NIO/OutPut//example.txt";
        Path path = Paths.get(location);
        try(OutputStream outputStream = Files.newOutputStream(path)){
            outputStream.write("Semicolon".getBytes());
        }catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    }
}
