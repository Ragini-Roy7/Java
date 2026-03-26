package Stack;
import java.util.*;
public class Next_Greater_Circular {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[] res= new int[n];
        //new arr
        Stack <Integer> stack= new Stack<>();

        for(int i=2*n-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<= nums[i%n]) {
                stack.pop();
            }
            if (i < n) {
                if (stack.isEmpty()) res[i] = -1;
                else res[i] = stack.peek();
            }

            stack.push(nums[i % n]);
        }

        return res;
        }

    public static void main(String[] args) {
        Next_Greater_Circular obj = new Next_Greater_Circular();
       int [] nums= {1,2,1};
       int[] res= obj.nextGreaterElements(nums);
        System.out.println(Arrays.toString(res));


    }
    }

