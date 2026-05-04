package src.Static_Non_Static.Recursion;

public class Count_Digits {
    public static int count_digits(int n){
        if(n==1){
            return 1;
        }
        return 1+count_digits(n/10);

    }

    public static void main(String[] args) {
        int n=1004;
        System.out.println(count_digits(n));
    }
}
