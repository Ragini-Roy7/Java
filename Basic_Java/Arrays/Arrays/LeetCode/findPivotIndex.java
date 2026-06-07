package Arrays.LeetCode;
import java.util.*;
//o (n)^2
public class findPivotIndex {
  public  static int calc_pivot_index(int[] nums) {
      for(int i=0;i<nums.length;i++) {
          int left= leftSum(nums,i);
          int right=rightSum(nums,i);

          //main condition to check if pivot index condition matches
          if(left==right) {
              //return the index
              return i;
          }
      }
      return -1;
  }
  private static  int rightSum(int[] nums, int index) {
      int sum=0;
      int i=index+1; //as right arr is  strictly increasing
      while(i<nums.length) {
          sum+=nums[i];
          i++;
      }
      return sum;
  }
  private static  int leftSum(int[] nums,int index) {
      int sum=0;
      int i=0;
      while(i<index) {
          sum+=nums[i];
          i++;
      }
      return sum;
  }

    public static void main(String[] args) {
        int[]nums= {1,7,3,6,5,5,6};
//        int index=0;
        int pivot_index= calc_pivot_index(nums);
        System.out.println(pivot_index);
    }

}
