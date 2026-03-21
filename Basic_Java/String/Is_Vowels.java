package String;
import java.util.Scanner;

public class Is_Vowels {
    public static int countVowels(String input) {
        int count = 0;
        input = input.toLowerCase(); //converting input into lowercase

        for (int i = 0; i < input.length(); i++) { //iterating through each character
            char ch = input.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your input string:");
        String userInput = sc.nextLine();

        int vowelCount = countVowels(userInput);
        System.out.println("number of vowels: " + vowelCount);
    }
}
