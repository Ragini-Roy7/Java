package src.Static_Non_Static.Recursion;

public class Fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        //fib->sum of its two prev sum
        //n-1 +n-2
        int fib1= fibo(n-1);
        int fib2= fibo(n-2);
        int fn= fib1+fib2;
        return fn;

    }

    public static void main(String[] args) {
        int n=25;
        System.out.println(fibo(n));
    }
}
