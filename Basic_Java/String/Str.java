package String;

import java.util.Scanner;

public class Str {

    public static void main(String[] args) {
        //getting ascii value of each char
        String str = "Ragini";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //conversion from char to int
            int new_str = ch;
            System.out.print(new_str + " ");
        }


    }
}
