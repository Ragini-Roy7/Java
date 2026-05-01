package src.Static_Non_Static.Recursion;

public class Power_X {
    public static int calc_pow(int x,int n){
        if(n==1){
            return x;
        }
        if(n==0){
            return 1;
        }
//        int power= calc_pow(x,n-1);
//        return x*power;
        return x*calc_pow(x,n-1);
    }

    public static void main(String[] args) {
        int n=5;
        int x=2;
        System.out.println(calc_pow(x,n));
    }
}
