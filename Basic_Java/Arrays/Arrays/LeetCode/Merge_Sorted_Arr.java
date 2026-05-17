package Arrays.LeetCode;
import java.util.*;

public class Merge_Sorted_Arr {

    public static int[] merge_sorted_arr(int[] nums_1, int m, int[] nums_2, int n) {

        int[] merged = new int[m + n];
        int i = 0, j = 0, k = 0;

        // Merge while both arrays have elements
        while (i < m && j < n) {
            if (nums_1[i] <= nums_2[j]) {
                merged[k++] = nums_1[i++];
            } else {
                merged[k++] = nums_2[j++];
            }
        }

        // Copy remaining elements
        while (i < m) {
            merged[k++] = nums_1[i++];
        }

        while (j < n) {
            merged[k++] = nums_2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {

        int[] nums_1 = {1, 2, 3, 4};
        int[] nums_2 = {5, 6, 7, 8, 9, 10};

        int m = nums_1.length;
        int n = nums_2.length;

        int[] result = merge_sorted_arr(nums_1, m, nums_2, n);

        System.out.println(Arrays.toString(result));
    }
}