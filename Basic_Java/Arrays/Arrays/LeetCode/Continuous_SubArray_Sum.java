package Arrays.LeetCode;
import java.util.*;
//using int[]
public class Continuous_SubArray_Sum {
    public static int[] continuous_subArray_sum(int[]arr, int k){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==k){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[]arr= {23,2,4,6,7};
        int k=6;
      int[] result= continuous_subArray_sum(arr,k);
        System.out.println(Arrays.toString(result));
    }
}
