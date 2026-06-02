// package Arrays.LeetCode;

public class MaxSubarray {

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {6, 7, 2, 1};
        System.out.println(maxSubArray(nums));
    }
}
