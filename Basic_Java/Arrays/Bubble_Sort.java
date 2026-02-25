package Arrays;

public class Bubble_Sort {
    public static void main(String[] args) {
        int[] arr = {5, 7, 2, 6, 1};
        Bubble_Sort.bubble_sort(arr);
        //print
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static void bubble_sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            //if already sorted
            if (isSwapped = false) {
                break;
            }
        }

    }
}

