package greedy;
import java.util.*;
public class maxAfterK {
    public static int largestSumAfterKNegations(int[] nums, int k) {

        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length && k > 0; i++) {

            if (nums[i] < 0) {
                nums[i] = -nums[i];
                //one step negation performed already so decrementing
                k--;
            }

            sum += nums[i];
        }

        // if k is still greater than 0 and should not be negative
        if (k > 0 && k % 2 != 0) {
            Arrays.sort(nums);
            nums[0] = -nums[0];
        }

        sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int[]nums= {1,2,3,4,5};
        int k=2;
        System.out.println(largestSumAfterKNegations(nums,k));
    }
}
