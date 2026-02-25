package Arrays;

public class Selection_Sort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 2, 6};

        selection_sort(arr);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void selection_sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            int min_ele_index = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min_ele_index]) {
                    min_ele_index = j;
                }
            }

            // swap
            int temp = arr[min_ele_index];
            arr[min_ele_index] = arr[i];
            arr[i] = temp;
        }
    }
}