//package Arrays.LeetCode;
//import java.util.*;
//public class Median_of_TwoSortedArrays {
//    public static int median_two_sorted_arr(int[]arr_1,int[]arr_2){
//
//       //calling the private function
//           merge_arr(arr_1,arr_2);
//
//    }
//    //helper func to merge
//    private static int[]  merge_arr(int[]arr_1,int[] arr_2){
//        int[] merged_arr= new int[arr_1.length+arr_2.length];
//        int i=0, j=0,k=0;
//        while(arr_1[i]<=arr_2[i]){
//           merged[k++]
//        }
//
//
//    }
//}
package Arrays.LeetCode;
import java.util.*;

public class Median_of_TwoSortedArrays {

    public static double median_two_sorted_arr(int[] arr_1, int[] arr_2) {

        int[] merged = merge_arr(arr_1, arr_2);

        int n = merged.length;

        // if even length
        if (n % 2 == 0) {
            return (merged[n/2 - 1] + merged[n/2]) / 2.0;
        }
        // if odd length
        else {
            return merged[n/2];
        }
    }

    // helper function to merge two sorted arrays
    private static int[] merge_arr(int[] arr_1, int[] arr_2) {

        int[] merged = new int[arr_1.length + arr_2.length];

        int i = 0, j = 0, k = 0;

        while (i < arr_1.length && j < arr_2.length) {
            if (arr_1[i] <= arr_2[j]) {
                merged[k++] = arr_1[i++];
            } else {
                merged[k++] = arr_2[j++];
            }
        }

        while (i < arr_1.length) {
            merged[k++] = arr_1[i++];
        }

        while (j < arr_2.length) {
            merged[k++] = arr_2[j++];
        }

        return merged;
    }

    public static void main(String[] args) {
        int[]arr_1={1,3};
        int[]arr_2={2};
        System.out.println(median_two_sorted_arr(arr_1,arr_2));
    }
}