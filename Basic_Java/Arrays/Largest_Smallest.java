package Arrays;

public class Largest_Smallest {

    public static void largest_smallest(int arr[]) {

        int largest_val = Integer.MIN_VALUE;
        int smallest_val = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (largest_val < arr[i]) {
                largest_val = arr[i];
            }

            if (smallest_val > arr[i]) {
                smallest_val = arr[i];
            }
        }

        System.out.println("Largest Value is: " + largest_val);
        System.out.println("Smallest Value is: " + smallest_val);
    }

    public static void main(String[] args) {

        int[] arr = {16, 76, 78, 45, 64, 75};
        largest_smallest(arr);
    }
}
