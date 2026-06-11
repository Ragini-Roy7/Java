package Arrays.LeetCode;
import java.util.*;
public class BuySellStockII {
    public static int buySellStock(int[]arr){
        int max_profit=0;

        for(int i=1;i<arr.length;i++) {
            //if current price is higher than prev day price
            //means we are having profit , store it
           if(arr[i]>arr[i-1]) {
               max_profit+=arr[i]-arr[i-1];
           }

        }
        return max_profit;

    }

    public static void main(String[] args) {
        int[]arr= {7,1,5,3,6,4};
        System.out.println(buySellStock(arr));
    }

}
