package src.Static_Non_Static.Recursion;

public class Sorted {
    public static boolean is_array_sorted(int [] arr,int i) {
        //base case
        if(i==arr.length-1){
            //has reached length
            return true;
            //base case
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        return is_array_sorted(arr,i+1);
        //not moving iteration to next index causes stack overflow where same elements keep on
        //calling itself infinitely leading to program crash or unexpected output
    }

    public static void main(String[] args) {
        int[]arr= {1,12,3,4,5,6,7,10,12,15,52};
        System.out.println(is_array_sorted(arr,0));
    }
}
