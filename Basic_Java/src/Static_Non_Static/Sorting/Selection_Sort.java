package src.Static_Non_Static.Sorting;

public class Selection_Sort {

    public static void selection_sort(int[] arr) {

        int n = arr.length;

        // find min from unsorted part
        for (int i = 0; i < n - 1; i++) {

            int min_index = i; // assume first element of unsorted part is minimum

            // find minimum element
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_index]) {
                    min_index = j;
                }
            }

            // swap the minimum element with left unsorted index
            int temp = arr[min_index];
            arr[min_index] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {

        int[] arr = {13, 46, 24, 52, 20, 9};

        selection_sort(arr);

        // print sorted array
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}