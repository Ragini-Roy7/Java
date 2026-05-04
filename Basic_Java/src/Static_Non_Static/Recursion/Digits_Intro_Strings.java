package src.Static_Non_Static.Recursion;
import java.lang.String;
public class Digits_Intro_Strings {
    static String[] strings={
            "zero", "one" ,"two", "three", "four","five",
            "six", "seven", "eight", "nine", "ten"
    }  ;
    public static void print_digit_intoStrings(int n) {
        if(n==0) {
            return;
        }
        //got last val using modulo
        int last_digit= n%10;
          //ie.print_digit_intoStrings(201) now
        //likewise  print_digit_intoStrings(20)
        //(0)
        //(2)
//        n % 10 → extracts last digit
//        printWords(n / 10) → removes last digit
    //returns->base case there is no digits left
//        Printing happens after recursion
        //    Correct left-to-right order is preserved  
        print_digit_intoStrings(n/10);
//        Smaller number prints first
        System.out.print(strings[last_digit] +" ");
    }


    public static void main(String[] args) {
        int n=2019;
        print_digit_intoStrings(n);
    }
}
