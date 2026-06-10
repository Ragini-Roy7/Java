package Arrays.LeetCode;
import java.util.*;
public class median_using_twoptrs {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] merged = new int[n1 + n2];

        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }

        while (i < n1) merged[k++] = nums1[i++];
        while (j < n2) merged[k++] = nums2[j++];

        int n = merged.length;
        if (n % 2 == 1) {
            return merged[n / 2];
        } else {
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }

    public static void main(String[] args) {


        int[] nums1 = {1, 2, 3, 4};
        int[] nums2 = {5, 6};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}