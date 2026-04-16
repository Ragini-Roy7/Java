//public class ArrayLeaders {
//    public static int array_leaders() {
//        int arr[] = {16, 17, 4, 3, 5, 2};
//
//        //find all leaders in arr, if it is greater than or equal to all ele to its right
//        int len = arr.length;
//        int maxRight=arr[len-1];
//        for(int i=0;i<=len-2;i--){
//            if(arr[i]>=maxRight){
//                maxRight=arr[i];
//                //make it leader
//                System.out.println(arr[i]);
//            }
//        }
//        return maxRight;
//
//    }
//
//    public static void main(String[] args) {
//
//        int res = array_leaders();
//    }
//}
import java.util.*;

class LeadersInArray {
    public static void main(String[] args) {
        int[] arr = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        ArrayList<Integer> leaders = new ArrayList<>();

        int maxRight = arr[n - 1];
        leaders.add(maxRight);
  //starting from second last
        //because last element is already taken as leader
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] >= maxRight) {
                maxRight = arr[i];
                leaders.add(arr[i]);
            }
        }

        // Print in reverse order
        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }
}