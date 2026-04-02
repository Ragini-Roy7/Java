package Patterns;
import java.util.*;

public class Star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows:");
        int rows = sc.nextInt();

        for (int i = 0; i < rows; i++) { //no of stars
            for (int j = 0; j <= rows; j++) { //line num
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}