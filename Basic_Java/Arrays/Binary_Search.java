package Arrays;

public class Binary_Search {
    public static int binary_search(int[] arr, int key) {
        //calc mid

        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) { //it is sorted array so larger value will be at end
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {56, 67, 75, 82, 84};
        int key = 67;
        System.out.println("Index for key is: " + binary_search(arr, key));

    }

}



