package Arrays;

public class Pairs_In_Array {
    public static void print_pairs(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //print current elements
            int current_ele = arr[i];

            for (int j = i + 1; j < arr.length; j++) {
                System.out.println("(" + arr[i] + "," + arr[j] + ")");

            }
        }

    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16};
        print_pairs(arr);
    }
}
