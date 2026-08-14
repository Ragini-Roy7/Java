package src.Static_Non_Static.Sorting;

import java.util.*;

public class BubbleSort {

    public static void Bubble_sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            boolean swapped = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            // No swap during the entire pass
            // means array is already sorted
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {5, 3, 4, 1};

        BubbleSort.Bubble_sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
