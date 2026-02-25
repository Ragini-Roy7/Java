package Arrays;

public class Max_Subarray_Sum {
    //prefix sum
    public static int prefix_sum(int[] arr) {
//        int prefix_end= arr[arr.length-1];
//        int prefix_start= arr[1];
//        int prefix_sum=0;
        int max_sum = Integer.MIN_VALUE;
        int curr_sum = 0;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
//            int start=i;
            for (int j = i; j < arr.length; j++) {
//                int end=j;
                curr_sum = i == 0 ? prefix[j] : prefix[j] - prefix[i - 1];
                if (max_sum < curr_sum) {
                    max_sum = curr_sum;
                }
            }
        }
        return max_sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println(prefix_sum(arr));

    }
}
