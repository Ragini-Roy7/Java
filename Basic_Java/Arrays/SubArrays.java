package Arrays;

public class SubArrays {
    public static void print_subArrays(int[] arr) {
        int total_subarrays = 0;
        int max_sum = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
//            int start=i;
            for (int j = i; j < arr.length; j++) {
//                int end=j;
                int sum = 0; //resetting for each subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = arr[k] + sum;
                    int curr_sum = sum;
                    if (max_sum < curr_sum) {
                        //update max sum
                        max_sum = curr_sum;
                    }


                }
                System.out.println("= " + sum);
                total_subarrays++;
                System.out.println();
//                System.out.println("Max sum is "+ max_sum);
            }
            System.out.println();
        }
        System.out.println(total_subarrays);
        System.out.println("Max sum is " + max_sum);

    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 64, 63, 65};
        print_subArrays(arr);

    }
}
