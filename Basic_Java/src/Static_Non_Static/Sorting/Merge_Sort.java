//package src.Static_Non_Static.Sorting;
//
//public class Merge_Sort {
//    public static void mergeSort(int []arr, int start_index, int end_index){
//        if(start_index>=end_index){
//            //means all elements has been sorted
//            //no elements left
//            return;
//        }
//        //recursive fn (induction-base- hypothesis)
//        //calc hypothesis
//        int mid= start_index + (end_index- start_index)/2;
//        mergeSort(arr,start_index,end_index);
//        merge_sort(arr,start_index,mid+1,end_index);
//    }
//    public static void merge_sort(int [] arr, int start_index, int mid,int end_index){
//        //using recursive approach
//        //using divide and conquer approach
//        //div arr[] by 2 ie-> n/2 = will get mid (left part)
//        //to n/2+1 ->will get mid+1 (right part)
//        //fn(left) +fn(right) ->recursive calls
//        //store within a temp var ,return it
//        int temp[]= new int[end_index-start_index+1];
//        int i=start_index;
//        //can also make a private helper function to find left and right subtree of arr
//        int j=mid+1;
//        int k=0;
//
//        while(i<=mid && j<=end_index){
//            if(arr[i] <arr[j]){
//                temp[k]=arr[i];
//                i++;
//            }else {
//                temp[k]= arr[j];
//                j++;
//            }
//            k++;
//        }
//        //calc left part of arr
//        //to insert left arr into temp for merging
//        while(i<=mid){
//            temp[k++]=arr[i++];
//        }
//        while(j>=end_index){
//            temp[k++]=arr[j++];
//        }
//    }
//
//    public static void main(String[] args) {
//        int[]arr= {6,3,9,5,2,8};
//        System.out.println(merge_sort(arr,0,arr.length-1);
//    }
//}

package src.Static_Non_Static.Sorting;

public class Merge_Sort {

    public static void mergeSort(int[] arr, int start, int end) {

        // base case
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;

        // sort left half
        mergeSort(arr, start, mid);

        // sort right half
        mergeSort(arr, mid + 1, end);

        // merge both halves
        merge(arr, start, mid, end);
    }

    public static void merge(int[] arr, int start, int mid, int end) {

        int[] temp = new int[end - start + 1];
        int i = start;      // left pointer
        int j = mid + 1;    // right pointer
        int k = 0;          // temp pointer

        while (i <= mid && j <= end) {
            if (arr[i] < arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }

        // copy remaining left elements
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // copy remaining right elements
        while (j <= end) {
            temp[k++] = arr[j++];
        }

        // copy temp back to original array
        for (int x = 0; x < temp.length; x++) {
            arr[start + x] = temp[x];
        }
    }

    public static void main(String[] args) {
        int[] arr = {6, 3, 9, 5, 2, 8};

        mergeSort(arr, 0, arr.length - 1);

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}