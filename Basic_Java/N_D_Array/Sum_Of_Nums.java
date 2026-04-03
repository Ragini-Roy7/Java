import java.util.Arrays;
public class Sum_Of_Nums {
    //sum of sec row elements
    public static void main(String[] args) {
        int[][] nums= {{1,4,9},
                {11,4,3},
                {2,2,3}};
        int sum=0;
        for(int j=0;j<nums.length;j++ ) {
            //not iterating over i because
            // needs only sec row sum
            sum+=nums[1][j];
        }
//        System.out.println("The sum of "+nums[1] + "is :"+sum);
        //[ indicates array, I -> array type int
        // @27716f4 is hashcode generated for the object
        //java converts nums[1].toString() , does not override toString() method
        //printing memory reference or hashcode generated for the object
        System.out.println("The sum of "+Arrays.toString(nums[1]) +  "  is : "+sum);
        //converting each element into readable format that java understands

    }
}
