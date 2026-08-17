package src.Static_Non_Static.Sorting.Divide_Enconquer;
import java.util.*;

public class SelectionSort {
    public static void Selection_sort(int[]arr){
        for (int i = 0; i < arr.length - 1; i++) {

            int minIndex = i;

            // Find minimum element in unsorted part
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap minimum with first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[]arr= {5,4,1,3,2};
        Selection_sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
