//package Arrays.LeetCode;

public class jumpGameII {

        public int jump(int[] nums) {
            int jumps = 0;
            int currEnd = 0;
            int currFarthest = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                currFarthest = Math.max(currFarthest, i + nums[i]);

                if (i == currEnd) {
                    jumps++;
                    currEnd = currFarthest;
                }
            }

            return jumps;
        }

    }

public static void main(String[] args) {
    int[] nums= {6,8,3,7};

}


