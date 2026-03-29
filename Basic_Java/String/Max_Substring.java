package String;
import java.util.Scanner;

public class Max_Substring {

    public static int countBalancedSubstrings(String s, char c1, char c2) {
        int balance = 0;
        int count = 0;

        for (char ch : s.toCharArray()) {
            if (ch == c1) {
                balance++;
            } else if (ch == c2) {
                balance--;
            }

            if (balance == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String s = sc.nextLine();

        System.out.print("Enter first character: ");
        char c1 = sc.next().charAt(0);

        System.out.print("Enter second character: ");
        char c2 = sc.next().charAt(0);

        int result = countBalancedSubstrings(s, c1, c2);

        System.out.println("Balanced substrings count: " + result);

        sc.close();
    }
}
