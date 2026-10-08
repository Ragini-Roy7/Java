//package Arrays.LeetCode.TwoPointers;
//import java.util.*;
//import java.util.Arrays;
//
//
//public class rotateArrTwoPointers {
//    public  void static int[] rotate(int arr[], int k) {
//        int left= 0;
//        int right=arr.length;
//        //move right ptr from n%k
//        for(int i=arr.length % k; i<=arr.length;i++) {
//            //moving right ptr
//            right++;
//            System.out.println(arr[i]);
//            for(int j=0;j<arr.length % k ;j++){
//                left++;
//                System.out.println(arr[i]);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int arr[]= {1,2,3,4,5,6,7};
//        int k=3;
//        System.out.println(Arrays.toString(arr(arr,k)));
//    }
//}
package Arrays.LeetCode.TwoPointers;

import java.util.Arrays;

public class rotateArrTwoPointers {

    public static void reverse(int[] arr, int left, int right) {

        while (left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public static int[] rotate(int[] arr, int k) {

        int n = arr.length;

        // Handle k greater than array length
        k = k % n;

        // Step 1: Reverse entire array
        reverse(arr, 0, n - 1);

        // Step 2: Reverse first k elements
        reverse(arr, 0, k - 1);

        // Step 3: Reverse remaining n-k elements
        reverse(arr, k, n - 1);

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        System.out.println(Arrays.toString(rotate(arr, k)));
    }
}
