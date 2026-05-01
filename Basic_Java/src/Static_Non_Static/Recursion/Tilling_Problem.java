package src.Static_Non_Static.Recursion;
//count no of ways to place 2*1 tile in 2*n floor size
public class Tilling_Problem {
    public static int tilling_prob(int n){
        //base case
        if(n==0 || n==1){
            //ie. 2x0-> no of ways -> 1
            return 1;
        }

        //main function
        int vertical_way= tilling_prob(n-1);
        int horizontal_way= tilling_prob(n-2);
        int total_ways= vertical_way+horizontal_way;
        return total_ways;
    }

    public static void main(String[] args) {
        System.out.println(tilling_prob(5));
    }
}
