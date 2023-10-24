package chapter15FIles;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class cdUser {
    BufferedWriter write;

    {
        try {
            write = new BufferedWriter(new FileWriter("/home/moyin/Downloads/JavaJava/src/chapter15FIles"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
