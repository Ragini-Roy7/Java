package Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 7, 2};
        Insertion_Sort.insertion_sort(arr);

        //print
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }

    public static void insertion_sort(int[] arr) {
        //algo:- start with arr[2] elem
        //compare  with prev element arr[i-1]
        //if arr[i] >arr[i-1]
        //swap
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] > arr[i - 1]) {
                    //swap
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;

                }
            }

        }

    }
}


