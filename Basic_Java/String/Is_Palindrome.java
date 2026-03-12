package String;
import java.util.Scanner;

public class Is_Palindrome {

    public static boolean is_palindrome(String org_str) {

        StringBuilder res = new StringBuilder();
        res.append(org_str);
        res.reverse();

        if(!org_str.equals(res.toString())) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter original string:");
        String org_str = sc.nextLine();

        if(is_palindrome(org_str)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
