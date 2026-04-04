package Leetcode_Problems;
import java.util.Arrays;
public class Square_Of_Rotated_Arr {
    public static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];

        int left = 0, right = n - 1;
        int pos = n - 1;

        while (left <= right) {
            int leftSq = arr[left] * arr[left];
            int rightSq = arr[right] * arr[right];

            if (leftSq > rightSq) {
                result[pos--] = leftSq;
                left++;
            } else {
                result[pos--] = rightSq;
                right--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {-4, -1, 0, 3, 10};

        int[] ans = sortedSquares(arr);

        System.out.println(Arrays.toString(ans));
    }

    }

