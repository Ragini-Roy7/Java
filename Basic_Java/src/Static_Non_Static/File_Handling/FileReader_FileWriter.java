package src.Static_Non_Static.File_Handling;
import java.io.FileReader;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;

public class FileReader_FileWriter {
    public static void main(String[] args) throws IOException {
        String str= "File Handling using FileReader and FileWriter";
        FileWriter fw= new FileWriter("student.txt");
        for(int i=0;i<str.length();i++){
            fw.write(str.charAt(i));
            System.out.println("writing done");
            fw.close();
        }
    }
}
