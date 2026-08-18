import java.util.*;
public class duplicate {
    public boolean containsDuplicate(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]) {
                    count++;
                }
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
