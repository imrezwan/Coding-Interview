package Java.JavaIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo {
    public static void main(String[] args) throws IOException {

        String workingDir = System.getProperty("user.dir");

        File file  = new File(workingDir+File.separator+"Java/JavaIO/hello.txt");

        if(!file.exists()){
            System.out.println("File doesn't exist");
            file.createNewFile();
        }
        else {
            System.out.println("File Already There");
        }

        System.out.println(); //working directory
        Scanner reader = new Scanner(file);

        while(reader.hasNextLine()){
            int a = reader.nextInt();
            int b = reader.nextInt();
            System.out.println(a + " "+ b+" ");
        }
        reader.close();
        System.out.println(file.canWrite());
        FileWriter writer = new FileWriter(file, true);
        writer.append("hello wrinting practice");
        writer.close();

    }
}
