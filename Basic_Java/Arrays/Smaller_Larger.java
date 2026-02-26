package Arrays;

public class Smaller_Larger {
    public static void main(String[] args) {
        int arr[]= {1,5,8,12,12,12,19};
        int target= 12;
        //count how many elements are smaller than target
        int smaller_count=0;
        int larger_count=0;
        for(int i=0;i<arr.length;i++) {
            if(arr[i]<=target) {
                //inc count by one
                smaller_count++;
            }
            if(arr[i]>=target) {
                larger_count++;
            }


//            System.out.println(smaller_count);
//            System.out.println(larger_count);
    }
        System.out.println(smaller_count);
        System.out.println(larger_count);


    }
}
