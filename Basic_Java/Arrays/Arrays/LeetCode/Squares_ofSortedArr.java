package Arrays.LeetCode;
import java.util.*;
import java.util.Arrays;
public class Squares_ofSortedArr {
    public static void squares_of_sorted_arr(int[] arr) {
        //using two pointers approach we can solve it
        //compare both the start and end pointers and then calc sq and perform sorting using pointers
        //take start and end pointers
//        int start= 0;
//        //keeping end pointer at last index
//        int end= arr.length-1;
//
//        //iterate through each element and compare using pointers
//        for(int i=0;i<arr.length;i++){
//            //case i
//            while(arr[start]<arr[end]){
//                //means end element is greater than start
//                //move end pointers backward
//                //move start pointers forward
//                end--;
//               start++;
//
//            }
//            int st=arr.length-1;
//            int en=arr[0];
//            while(arr[st]>arr[en]){
//                //move start pointer backward
//                //move end pointer forward
//                st--;
//                end++;
//
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        int[]arr= {1,2,3,4,5,6,7,8,9,11};
//        squares_of_sorted_arr(arr);
//
//    }
//}

        int n = arr.length;
        int[] result = new int[n];

        int start = 0;
        int end = n - 1;
        int index = n - 1;

        while (start <= end) {

            int leftSq = arr[start] * arr[start];
            int rightSq = arr[end] * arr[end];

            if (leftSq > rightSq) {
                result[index--] = leftSq;
                start++;
            } else {
                result[index--] = rightSq;
                end--;
            }
        }

        System.out.println(Arrays.toString(result));
    }

    public static void main(String[] args) {
        int[]arr= {11,23,43,54,55,66,75,86};
        squares_of_sorted_arr(arr);
    }
}