package src.Static_Non_Static.Recursion;

public class SumOfPairs {
    public static int subsetSum(int[]arr){
        //calc subset sum
        int sum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[i]+arr[j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr={2,5,6,1};
        System.out.println(subsetSum(arr));
    }
}

