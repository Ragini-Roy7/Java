//package Arrays.LeetCode;
import java.util.*;
public class Three_sum_Closet {
    //using two pointers
    public static int Three_SumCloset(int[]arr,int target){
        Arrays.sort(arr);
        int closestSum = arr[0] + arr[1] + arr[2];
        for (int i = 0; i <arr.length - 2; i++) {
            int low = i + 1;
            int high = arr.length - 1;

            while (low < high) {
                int sum =arr[i] + arr[low] + arr[high];

                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }

                if (sum < target) {
                    low++;
                } else if (sum > target) {
                    high--;
                } else {
                    return sum; // exact match
                }
            }
        }
        return closestSum;
    }

    }

public static void main(String[] args) {
    int []arr= {1,-1,2,3,1};
    int target=2;
  int res=  Three_sum_Closet.Three_SumCloset(arr,target);
    System.out.println(res);

}


