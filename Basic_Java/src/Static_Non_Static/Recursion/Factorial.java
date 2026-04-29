package src.Static_Non_Static.Recursion;

public class Factorial {
    public static int fact(int n) {
        //handle edge cases as well
        if (n == 0) {
            //base case
            return 1;//factorial of 0!->1
        }
        if (n < 0) {

            //negative values
            return -1;
        }
        //recursive call
        int fact= fact(n-1);
        int fact_no= n*fact(n-1);
        return fact_no;
    }

    public static void main(String[] args) {
        int n=10;
        System.out.println(fact(n));

    }
    }
