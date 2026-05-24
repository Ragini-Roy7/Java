package Arrays.LeetCode;
import java.util.*;
public class BestTimeToBuySell {
    public static int bestTimeToBuySell(int[]arr){
        //can check if its actually making profit or loss
        int max_profit=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++){
                int profit= arr[j]-arr[i];
                 max_profit= Math.max(max_profit,profit);
            }
        }
        return max_profit;

    }

    public static void main(String[] args) {
        int[]arr= {7,1,5,3,6,4};
    int res=bestTimeToBuySell(arr);
        System.out.println(res);

    }
}
