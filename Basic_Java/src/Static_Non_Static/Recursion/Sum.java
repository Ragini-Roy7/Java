package src.Static_Non_Static.Recursion;

public class Sum {
    public static int sum(int n) {
        if (n == 1) {
            return 1; //base case
        }
        //calc sum of first n no.
        int sum_of_n = sum(n - 1); //if n=5 ->4
        int sn = n + sum_of_n; //ie. n+(n-1)
        return sn;

    }
        public static void main (String[]args){
            int n = 15;
            System.out.println(sum(n));
        }
    }
