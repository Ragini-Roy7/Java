package Arrays.LeetCode;

public class JumpGame {
    public static boolean canJump(int[] nums) {
        int maxReach = 0;

        for (int i = 0; i < nums.length; i++) {
            // if curr index is unreachable
            if (i > maxReach) {
                return false;
            }

            // Update the farthest we can reach
            maxReach = Math.max(maxReach, i + nums[i]);

            // If we can already reach last index
            if (maxReach >= nums.length - 1) {
                return true;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[]nums= {2,3,1,1,4};
        System.out.println(canJump(nums));
    }
}
