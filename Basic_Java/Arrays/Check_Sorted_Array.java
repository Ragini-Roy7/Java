package Arrays;

public class Check_Sorted_Array {


    public static boolean sorted_array(int [] arr) {
//        boolean is_sorted=false;
        for(int i=0;i<arr.length-1;i++) {
          if(arr[i]>arr[i+1]) {
             return false;
          }

        }
       return true;

    }
    public static void main(String[] args) {
        int arr[] = {1,2,1,4,5};
        System.out.println(sorted_array(arr));

    }
}

