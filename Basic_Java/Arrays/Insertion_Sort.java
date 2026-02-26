package Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[] arr = {2, 8, 5, 7, 2};
        Insertion_Sort.insertion_sort(arr);

        //print
        for (int num : arr) {
            System.out.print(num + " ");
        }


    }

    public static void insertion_sort(int[] arr) {
        //algo:- start with arr[2] elem
        //compare  with prev element arr[i-1]
        //if arr[i] >arr[i-1]
        //swap
        for (int i = 1; i < arr.length; i++) {
           //considering first ele is always sorted
            int current=arr[i];
            int prev=i-1;
            while(prev>=0 && arr[prev]>current) {
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=current;

        }

    }
}


