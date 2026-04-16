//package Arrays;

import java.util.Arrays;


public class Atleast_Two_Greater_Sort {
    public static void main(String[] args) {

        int arr[] = {2, 8, 7, 1, 5};

        int max = Integer.MIN_VALUE;
        int sec_max = Integer.MIN_VALUE;

        // Find max and second max
        for (int num : arr) {
            if (num > max) {
                sec_max = max;
                max = num;
            } else if (num > sec_max) {
                sec_max = num;
            }
        }

        System.out.println("Max: " + max);
        System.out.println("Second Max: " + sec_max);

        // Create new array skipping max & second max
        int[] result = new int[arr.length - 2];
        int index = 0;

        for (int num : arr) {
            if (num != max && num != sec_max) {
                result[index++] = num;
            }
        }

        Arrays.sort(result);

        System.out.println("Sorted without max & second max: "
                + Arrays.toString(result));
    }
}
