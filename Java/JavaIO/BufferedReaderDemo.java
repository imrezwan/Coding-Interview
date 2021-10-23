package Java.JavaIO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class BufferedReaderDemo {

    public static void main(String[] arg) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        do{
            line = reader.readLine();
            line = line.toUpperCase();
            System.out.println(line);
        }
        while(!"quit".equals(line));
    }
}

