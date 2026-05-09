package src.Static_Non_Static.Sorting.Divide_Enconquer;

public class Search_InRotatedBinarySearch {
    public static int search(int arr[], int tar, int si, int ei) {
        if (si > ei) {
            return -1;
        }
        //divide and conquer -> divided the arr into two halves
        int mid = si + (ei - si) / 2;
        if (arr[mid] == tar) {
            //case 1 if arr[mid] is the target
            return mid;
        }

        //case 2 if target is on left line 1
        if (arr[si] <= arr[mid]) {
            //case 2.a: left
            if (arr[si] <= tar && tar <= arr[mid]) {
                return search(arr, tar, si, mid);
            } else {
                //case 2.b: right
                return search(arr, tar, mid + 1, ei);
            }
        }
        //case 2 if target is on right line 2
        else {
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return search(arr, tar, mid + 1, ei);
            }
        }
        return -1;
    }
        public static void main (String[]args){
        int []arr= {4,5,6,7,0,1,2,3};
        int tar=6;
      int tar_index=  search(arr,tar,0,arr.length-1);
            System.out.println(tar_index);

        }
    }
