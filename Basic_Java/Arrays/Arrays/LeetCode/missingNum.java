package Arrays.LeetCode;
import java.util.*;
public class missingNum {
    public  static int missingNumber(int[] nums) {
        int n = nums.length;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
//        int[] nums={1,0,3};
//        System.out.println(new missingNum());
    }
}
