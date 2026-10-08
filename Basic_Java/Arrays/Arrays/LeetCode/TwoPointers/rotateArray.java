package Arrays.LeetCode.TwoPointers;
import java.util.Arrays;
//using mathematical way
//the idea is to use length of arr - kth index
public class rotateArray {
    public static int[] arr(int[] arr, int k) {
        int n = arr.length;
        int m = n - k;
        int result[]= new  int[n];
        int j=0;

        for (int i = m ; i < n; i++) {
            //mapping the result[] with index j so that each time res gets updated, index gets inc by+1
            //create new arr and merge both the arrays

           result[j]= arr[i];
          j++;

        }
        for (int i = 0; i < m; i++) {
            result[j]= arr[i];
            j++;
        }
       //we don`t need to merge both the arrays independently using one array result[] ,adding both the arrays
        return result;


    }


    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,7};
        int k=3;
        System.out.println(Arrays.toString(arr(arr,k)));
    }
}
