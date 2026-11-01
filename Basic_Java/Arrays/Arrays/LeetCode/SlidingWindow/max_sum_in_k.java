package Arrays.LeetCode.SlidingWindow;
import java.util.*;
public class max_sum_in_k {
    public static int maxSum(int []nums,int k){
        int sum=0;

        for(int i=0;i<k;i++ ){
            sum+= nums[i];
        }
        //moving window size by moving low and high
        //second window
//        int low=0, high= k-1;
        int maxSum=sum;
        for(int i= k; i< nums.length;i++){

            sum = sum - nums[i-k] + nums[i];
//             low++;
//            high++;
        }
        return Math.max(maxSum,sum);
    }

    public static void main(String[] args) {
        int nums[]= {3,4,5,6,7};
        int k=2;
        System.out.println(maxSum(nums,k));
    }
}
