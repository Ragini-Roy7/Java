package Arrays.LeetCode;
import java.util.Arrays;
public class FindFirst_LastPos_InSortedArr {

    public static int[] first_last_pos(int[] arr, int target) {

        int first = findFirst(arr, target);
        int last = findLast(arr, target);

        return new int[]{first, last};
    }

    private static int findFirst(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;        // store answer
                high = mid - 1;   // go LEFT
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }
    private static int findLast(int[] arr, int target) {

        int low = 0, high = arr.length - 1;
        int ans = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                ans = mid;       // store answer
                low = mid + 1;   // go RIGHT
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;

        int[] result = first_last_pos(arr, target);

        System.out.println(Arrays.toString(result));
    }
}