package Arrays.LeetCode;
import java.util.*;
public class findPivotIndexOptimized {
    public static int find_pivot_index(int [] nums){
        int total_sum=0;
        //calc total sum
        for(int num:nums) {
            total_sum += num;
        }

        int leftSum=0;
        for(int i=0;i<nums.length;i++) {
            int rightSum= total_sum - leftSum- nums[i];
            //main condition for given problem
            //pivot ele if leftSum==rightSum then its pivot
            if(leftSum==rightSum) {
                return i;
            }
            leftSum+=nums[i];


        }
       return -1;

    }

    public static void main(String[] args) {
        int[] nums= {1,7,3,6,5,6};
        int pivot_index= find_pivot_index(nums);
        System.out.println(pivot_index);
    }

}
