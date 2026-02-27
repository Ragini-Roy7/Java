package Arrays;

public class First_Occurrance {
    public static int first_index(int arr[],int target) {
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
        //not found
    }
    public static void main(String[] args) {
        int arr[]= {2,3,4,5,3};
        int target=3;
        System.out.println(First_Occurrance.first_index(arr,target));
    }
}
