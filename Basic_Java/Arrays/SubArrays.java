package Arrays;

public class SubArrays {
    public static void print_subArrays(int[] arr) {
        int total_subarrays = 0;

        for (int i = 0; i < arr.length; i++) {
//            int start=i;
            for (int j = i; j < arr.length; j++) {
//                int end=j;
                int sum = 0; //resetting for each subarray
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                    sum = arr[k] + sum;


                }
                System.out.println("= " + sum);
                total_subarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println(total_subarrays);

    }

    public static void main(String[] args) {
        int[] arr = {12, 4, 5, 64, 63, 65};
        print_subArrays(arr);

    }
}
