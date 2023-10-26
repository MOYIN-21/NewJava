package Chapter15.FIlesIO.OutPut;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamSample {
    public static void main(String[] args) {
        try(var fileOutPutStream = new FileOutputStream("fileOutPut.txt", true)){
            String sentence = "Moyin is a young lady";
            fileOutPutStream.write(sentence.getBytes());
        }catch(IOException exception){
            System.err.println(exception.getMessage());

        }
    }
}
