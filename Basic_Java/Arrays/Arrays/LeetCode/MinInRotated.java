package Arrays.LeetCode;

public class MinInRotated {
    public static int min_in_rotatedSorted(int[] arr, int k) {

        //elements after pivot ele
//        int right= arr[k+1];
//        int n=arr.length;
//        int pivot_pos= k % n;

        //pivot element from where the arr is getting rotated
//        int left= arr[pivot_pos];
        //approach:- split the array into before pivot_ele , after pivot_ele
        //merge then return it as res
//        for(int i=0;i<arr.length;i++){
//            //merge both into []
//            int merged_arr[] ;
//            int i1 = arr[left] + arr[right];
//            merged_arr[]= arr[left] +arr[right];
//            //use min() fn of java to find min now return it as res
//
//
//        }
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9,11};
        int k = 4;
        int res = min_in_rotatedSorted(arr, k);
        System.out.println(res);
    }
}