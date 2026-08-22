package greedy;
import java.util.*;
public class max_prod {
    public static int maxProduct(int[] arr) {
        // code here
        //choose the max element
        int largest = -1;
        int second = -1;
        int max_prod=1;

        for (int x : arr) {

            if (x > largest) {
                second = largest;
                largest = x;
            }
            else if (x > second) {
                second = x;
            }
            max_prod= largest*second;
        }
        return max_prod;
    }

    public static void main(String[] args) {
        int[]arr= {1,2,3,4,5,6,73};
        System.out.println(maxProduct(arr));
    }
}
