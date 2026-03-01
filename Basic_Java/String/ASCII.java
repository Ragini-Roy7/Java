package String;
import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your name: ");
        String name=sc.next();
        char[] lower_case= new char [name.length()];
        for(int i=0;i<name.length();i++) {
            char ch= name.charAt(i);
            //printing only ascii value of each char in name
            System.out.println(ch+"->"+(int)(ch));
        }
    }

}
