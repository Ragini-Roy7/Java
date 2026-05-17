package Arrays.LeetCode;
import java.util.*;
public class Continuous_SubArray_Sum_LC {
    public static boolean continuous_subarray_sumEqlWithK(int[]arr, int k){

        for(int i=0;i<arr.length-1;i++){
            int sum=arr[i];
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];

                //valid continuous subarray sum only if subarray size is >=2
                if(sum==k && (j-i+1)>=2){
                    return true;

                    //length of i and j
//                    int length= i-j+1;
//                    if(length>=2){
//                        //then only return true or false if value found
//                        return true;
//                    }
//                    sum+=arr[j];
//                    //accumulated sum
//                    int len= j-i+1;

                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr= {23,2,4,6,7};
        int k=6;
        System.out.println(continuous_subarray_sumEqlWithK(arr,k));
    }
}
