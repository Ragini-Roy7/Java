package Arrays.LeetCode.SlidingWindow;
import java.util.*;
public class largest_sum_k {
    public static int largestSum(int arr[], int k) {
        int n = k - 1;
        int low = 0, high = arr.length;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            //first window sum
            sum += arr[i];
        }
        int maxSum = sum;
        for (high = k; high < arr.length; high++) {
            sum -= arr[high - k];
            sum += arr[high];
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;

    }
        public static void main (String[]args){
            int arr[] = {100, 200, 400, 500, 600, 800};
            int k = 3;
            System.out.println(largestSum(arr,k));
        }
    }
