package Arrays;

public class Reverse_Array {
    public static boolean reverse_array(int[] arr) {
        //swap
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            //keep on updating start and end
            //start by +1 and end by -1
            //till start<end
            start++;
            end--;
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr = {56, 78, 56, 48, 86};
        reverse_array(arr);
        //printing rev array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }

    }
}
