//package Arrays.LeetCode;
//import java.util.*;
//public class ThreeSum_Recursion {
//    public static void threeSum_Recursion(int[]arr){
//
//        //base case 1
//        //if array has already exhausted its path
//        int count=0;
//        int currentSum=0;
//
//
//        if(count==3){
//            if(currentSum==0){
//                //it means this is valid triplet formed
//            }
//            return;
//        }
//        //base case 2
//        if(arr[i]=arr.length){
//
//        }
//
//    }
//}

package Arrays.LeetCode;
import java.util.*;

public class ThreeSum_Recursion {

    public static void threeSum_Recursion(int[] arr) {
        backtrack(arr, 0, 0, 0, new ArrayList<>());
    }

    private static void backtrack(
            int[] arr,
            int index,
            int count,
            int currentSum,
            List<Integer> path
    ) {

        // Base case 1: triplet formed
        if (count == 3) {
            if (currentSum == 0) {
                System.out.println(path);
            }
            return;
        }

        // Base case 2: array exhausted
        if (index == arr.length) {
            return;
        }

        // Choice 1: INCLUDE arr[index]
        path.add(arr[index]);
        backtrack(arr, index + 1, count + 1, currentSum + arr[index], path);
        path.remove(path.size() - 1); // BACKTRACK

        // Choice 2: EXCLUDE arr[index]
        backtrack(arr, index + 1, count, currentSum, path);
    }

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, -1, -4};
        threeSum_Recursion(arr);
    }
}