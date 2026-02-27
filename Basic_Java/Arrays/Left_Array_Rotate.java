package Arrays;

public class Left_Array_Rotate {
    public static int []  left_rotate (int arr[]) {
        //approach- take temp=arr[0]
        //shift elements from left
        //put temp at last
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++) {
            //shift elements
            arr[i]=arr[i+1];


        }
        //put first el at last
        arr[arr.length-1]=temp;
        return arr;


    }

    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
      left_rotate(arr);
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
