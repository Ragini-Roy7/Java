package src.Static_Non_Static.Recursion;

public class Last_Occurrence {
    public static int find_last_occurrence(int[] arr, int i, int target){
        if(i==arr.length){
            return -1;
            //base case reached
        }
        //main condition
//        if(arr[i]==target){
//            //last index of matched target
        //this doesn`t include all the general cases, it may be possible that last
        //occurrence maybe at the end of array or atleast not at current position
        //so this logic breaks down , not always adjacent occurrence guaranteed
//            return i+1;
//        }
        //go till the end of array, entire traversal
        int ansFromRightMost= find_last_occurrence(arr,i+1,target);

        //if right side has answer
        if(ansFromRightMost!=-1){
            return ansFromRightMost;
        }
        if(arr[i]==target){
            return i;
        }
        return -1;
        //not found
    }

    public static void main(String[] args) {
        int [] arr= {1,2,2,3,4,2};
        int target=2;
        int res= find_last_occurrence(arr,0,target);
        System.out.println(res);
    }
}
