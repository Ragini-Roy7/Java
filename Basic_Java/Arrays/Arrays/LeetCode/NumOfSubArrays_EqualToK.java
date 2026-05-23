//package Arrays.LeetCode;
import java.io.*;
import java.util.Arrays;
public static int calc_SuArrays_EqualOrGreaterK(int[]arr, int k) {
 int count=0;
 for(int i=0;i<arr.length;i++){
     //setting value of sum initial
     int sum=0;
     for(int j=i;j<arr.length;j++){
         sum+=arr[j];
         //actual given condition
         if(sum>=k){
             //inc count
             count++;
         }
     }
 }
 return count;

}


public static void main(String[] args) {
    int[]arr= {2,1,3,4,1,2};
    int k=4;
    int res=calc_SuArrays_EqualOrGreaterK(arr,k);
    System.out.println(res);

}