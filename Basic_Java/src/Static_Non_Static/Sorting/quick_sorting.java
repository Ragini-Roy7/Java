package src.Static_Non_Static.Sorting;

public class quick_sorting {
    public static void printing_the_arr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    public static void  quickSort(int[] arr,int si,int ei){
        //choose pivot element
        //considering last_el as pivot el

        //base case
        if(si>=ei){
            return;
        }
        //pivot_index ele
        int pivot_idx= partition(arr,si,ei);
        //sorting into left side
        quickSort(arr,si,pivot_idx -1);
        //sorting into right side
        quickSort(arr,pivot_idx+1,ei);
        }


    public static int partition(int arr[], int si,int ei) {
        //taking last el
        int pivot_el = arr[ei];
        int i = si - 1;
        //making iterator at -1

        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot_el) {
                i++;


                //swapping arr[i] and arr[j]
                //right element swapping by comparing it with pivot el
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                //left element swapping by comparing it with pivot element


            }
        }
        i++;
        //moving the iterator
        int temp = arr[i];
        arr[i]=arr[ei];
        arr[ei]=temp;

        //fixing the pivot position
        return i;


    }

public static void main(String[] args) {
    int[] arr= {6,3,9,5,2,8};
    quickSort(arr,0,arr.length-1);
    printing_the_arr(arr);
}
}