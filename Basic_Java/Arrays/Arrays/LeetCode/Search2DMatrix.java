package Arrays.LeetCode;
import java.util.*;
public class Search2DMatrix {
    public static boolean search_ele_2D(int[][]arr, int target) {
        //using binary search
        int rows = arr.length;
        int cols = arr[0].length;
        int low = 0;
        int high = rows * cols-1;

        while (low <= high) {
            //find mid_key , will iterate towards finding ele before mid and after mid
            //modified formula
            int mid = low + (high - low) / 2;
            //formula to find midrow
            int midRow = mid / cols;
            //to find midCol
            int midCol = mid % cols;

            if (arr[midRow][midCol] == target) {
                return true;
            } else if (arr[midRow][midCol] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
//            return false;

        }
        return false;


    }
    public static void main(String[] args) {
        int arr[][]= {{1,2,4,8},{10,11,12,13},{14,20,30,40}};
        int target = 10;
        boolean final_res= search_ele_2D(arr,target);
        System.out.println(final_res);
    }
}
