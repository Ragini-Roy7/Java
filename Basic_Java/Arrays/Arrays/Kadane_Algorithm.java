package Arrays;




public class Kadane_Algorithm {
    public static void main(String[] args) {
        int arr[]= {2,5,4,6,1};
        System.out.println(Kadane_Algorithm.max_subarray(arr));

    }
    public static int max_subarray(int arr[]) {
        int current_sum=arr[0];
        int max_sum=arr[0];
        for(int i=1;i<arr.length;i++) {
            current_sum= Math.max(arr[i],current_sum+arr[i] );
            max_sum=Math.max(max_sum, current_sum);
        }
        return max_sum;
    }
}
