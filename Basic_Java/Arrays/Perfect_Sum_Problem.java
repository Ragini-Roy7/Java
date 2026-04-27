//import java.util.Arrays;
//import java.util.ArrayList;
//import java.util.List;
//public class Perfect_Sum_Problem {
//    public static void main(String[] args) {
//        List<Integer> leftSums = new ArrayList<>();
//        List<Integer> rightSums = new ArrayList<>();
//
////        System.out.println("h");
//        int[] arr = {5, 2, 3, 10, 6, 8};
//        //given input
//        int arr_1 = arr.length / 2; //{5,2,3}=3
//        int arr_2 = arr.length / 2; //{10,6,8} =3
//        int target=10;
//        int mid=arr.length/2; //3
//        int count=0;
//
//
//        //this is called meet in the middle approach
//        //generate possible subsets from both the subsets
//
//        //approach :- add each subset and match it to target
//        //if sum of all elements from given subset > target
//        //do not consider
//        //2*n = 2*3=2*2*2
//
//        for (int i = 0; i < Math.pow(2, mid); i++) {
//            int sum_1 = 0;
//            {
//                for(int j=0;j<mid;j++){
//
//                    if((i/(int)Math.pow(2,j))%2==1){
//
//                        sum_1+=arr[j];
//                    }
//                    leftSums.add(sum_1);
//
//                }
//            }
//
//            }
//        for(int i=0;i<Math.pow(2,arr_2);i++){
//            int sum_2=0;
//
//            for(int j=0;j<arr_2;j++){
//                if((i/(int)Math.pow(2,j))%2==1){
//
//                    sum_2+=arr[j];
//                }
//            rightSums.add(sum_2);
//
//            }
//            //most important constraint of gfg
//            //cross combination allowed from both the halves
//           int cross_sum= sum_1+sum_2;
//        }
//       System.out.println("total no of subsets equal to "+ target+ "is :"+count);
//
//        }
//
//
//
//    }

import java.util.ArrayList;
import java.util.List;

public class Perfect_Sum_Problem {
    public static void main(String[] args) {

        List<Integer> leftSums = new ArrayList<>();
        List<Integer> rightSums = new ArrayList<>();

        int[] arr = {5, 2, 3, 10, 6, 8};
        int target = 10;

        int mid = arr.length / 2; // 3
        int count = 0;

        //first subset half
        for (int i = 0; i < Math.pow(2, mid); i++) {
            int sum_1 = 0;

            for (int j = 0; j < mid; j++) {
                if ((i / (int) Math.pow(2, j)) % 2 == 1) {
                    sum_1 += arr[j];
                }
            }
            leftSums.add(sum_1);
        }
//next subset half
        for (int i = 0; i < Math.pow(2, mid); i++) {
            int sum_2 = 0;

            for (int j = 0; j < mid; j++) {
                if ((i / (int) Math.pow(2, j)) % 2 == 1) {
                    sum_2 += arr[j + mid];
                }
            }
            rightSums.add(sum_2);
        }

        for (int x : leftSums) {
            for (int y : rightSums) {
                if (x + y == target) {
                    count++;
                }
            }
        }

        System.out.println("total no of subsets equal to " + target + " is: " + count);
    }
}