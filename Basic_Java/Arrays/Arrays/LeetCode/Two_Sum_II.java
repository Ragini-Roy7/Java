package Arrays.LeetCode;
import java.util.*;
public class Two_Sum_II {
    public static int[] two_sum_ii(int[]num,int target){
        //using binary search
        int mid= num.length/2;
        //left search
       //divide the loop computation by reducing it to mid of arr

        //try leftsearch
        int[] leftRes= leftSearch(num,target,mid);
        if(leftRes[0]!=-1){
            //if not found
            //do right search
            return leftRes;
        }
        else {
            int[] rightRes= rightSearch(num,target,mid);
            if(rightRes[0]!=-1){
                return rightRes;
            }
        }
        return new int[] {-1,-1};



    }
    private static int[] leftSearch(int[] num, int target, int mid){
        //we need to pass already computed mid_key
        for(int j=0;j<num[mid];j++){
            for(int k=j+1;k<num[mid];k++){
                if(num[j]+num[k]==target){
                    return new int[]{j,k};
                }
            }
        }
        return new int[] {-1,-1};
    }
    private static int[] rightSearch(int[] num, int target, int mid){
        for(int j=0;j<num[mid+1];j++){
            for(int k=j+1;k<num[mid+1];k++){
                if(num[j]+num[k]==target){
                    return new int[] {j,k};
                }
            }
        }
        return new int[] {-1,-1};
    }

    public static void main(String[] args) {
        int[] nums= {2,3,4,7,11,15};
        int target=9;
        int[] res= two_sum_ii(nums, target);
        //converting it into toString because its passed as new arr of int[]
        System.out.println(Arrays.toString(res));

    }

}
