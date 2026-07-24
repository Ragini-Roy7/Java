package Arrays.LeetCode.sorting;
import java.util.*;

public   class removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int write = 2;

        for (int read = 2; read < nums.length; read++) {

            if (nums[read] != nums[write - 2]) {
                nums[write] = nums[read];
                write++;
            }
        }

        return write;

    }

    public static void main(String[] args) {
        int nums[]= {1,1,1,2,2,3,3};
        System.out.println(removeDuplicates(nums));
    }
}
