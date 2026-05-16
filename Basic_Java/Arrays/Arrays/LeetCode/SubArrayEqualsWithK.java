package Arrays.LeetCode;
import java.util.*;
public class SubArrayEqualsWithK {
    public static int subarray_equals_K(int[]arr,int k){
        int count=0;
        //starting index
        for(int i=0;i<arr.length;i++){
            int sum=0;
            //ending index
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
               if(sum==k){
                   count++;
               }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int k = 2;
        System.out.println(subarray_equals_K(arr,k));
    }
}
