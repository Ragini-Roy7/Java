package src.Static_Non_Static.File_Handling;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileBuffer {
    public static void main(String[] args) throws IOException {
        try {
            FileWriter fw= new FileWriter("student.txt");
        fw.write("we are learning file handling using excpetions ");
        fw.close();
        FileReader fr = new FileReader("student.txt");
        BufferedReader bufferedReader = new BufferedReader(fr);
        int ch;
        System.out.println("File Reader:");
        while ((ch = bufferedReader.read()) != -1) {
            System.out.println(ch);
        }
    }
    catch(Exception e){
            System.out.println("an error occurred");
        }
    }
}
