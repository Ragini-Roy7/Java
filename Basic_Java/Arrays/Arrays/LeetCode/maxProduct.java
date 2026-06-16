package Arrays.LeetCode;
import java.util.*;
public class maxProduct {
    //using kadane algo
    public static int maxProd(int[]nums){
        int max=nums[0];
        int min=nums[0];
        int res= nums[0];
        for(int i=1;i<nums.length;i++) {
            //if current element is negative element swap it with max and min
            if (nums[i] < 0) {
                int temp = max;
                max = min;
                min = temp;
            }
            max=Math.max(nums[i], max*nums[i]);
            min=Math.min(nums[i], min*nums[i]);
            res= Math.max(res,max);
        }
        return res;

    }

    public static void main(String[] args) {
        int[]nums= {3,-4,-1,3};
        int res=maxProd(nums);
        System.out.println(res);
    }
}
