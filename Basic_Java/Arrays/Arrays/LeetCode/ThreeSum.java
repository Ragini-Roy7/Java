package Arrays.LeetCode;
import java.util.*;
import java.util.Arrays;
public class ThreeSum {
    public static int [] threeSum(int[]arr) {
//not optimized
        //not leetcode expected time complexity, also not generating triplets only returning arr ele
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    //constraint given :-
                     //must not contain duplicate triplets
                    if (arr[i]!=arr[j] && arr[j]!=arr[k] && arr[i]!=arr[k]) {
                        if (arr[i] + arr[j] + arr[k] == 0) {
                            return new int[] {arr[i],arr[j],arr[k]};


                        }


                    }
                }
            }
        }
        return new int[] {-1,-1};
    }
    public static void main(String[] args){
    int [] arr= {-1,0,1,2,-1,-4};
    int[] res= threeSum(arr);
        System.out.println(Arrays.toString(res));

    }
}
