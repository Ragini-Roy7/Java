package Arrays.LeetCode;

public class Search_InsertPosition {
    public static int search_pos(int[] nums, int k) {
        //binary search based prob
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == k) {
                return mid;
            }
            else if (nums[mid] < k) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        // insertion position
        return low;
    }



    public static void main(String[] args) {
        int[]arr= {1,3,5,6};
        int k=5;
       int res= search_pos(arr,k);
        System.out.println(res);

    }
}
