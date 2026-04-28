import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
public class All_Subsets {
    static int count=0;
    static void subsets(int index, int[] arr, int currentSum,int target,List<Integer>curr){
//        int[] arr= {2,4,5,3};
//       static int count=0;
//backtracking is undoing all the prev states
        // in subsets-> { 2,4,5,3,3} will be polluted subset where 3 is repeated
        //to trace unique subset verification, we need to backtrack and remove polluted elements
        //although recursive calls lead to recomputation of already calc results
        //where memoization tech of dp comes in
        //memoization remembers already computed values



        //make recursive calls
        //take two choices either to choose first index ie. 2 or not
        //if not taken -> { } possible subset -> first recursive level
        //if taken -> { 2 } possible subset ->first recursive level
        // if not taken -> {4} -> subset remains same -> {2}  ->second recursive call
        //if taken -> {4} -> subset get changed -> {2, 4}  ->second recursive call
        //if not taken -> {5} -> subset remains same {2, 4 }  ->third recursive call
        //if taken -> {5} -> subset get changed {2,4, 5} ->third recursive call
        //if not taken ->{3} -> subset remains {2,4,5 } -> forth recursive call
        // if taken -> {3} ->subset get changed {2,4,5,3}

        //base case -> if index reached to its length stop making recursive calls
        if(index==arr.length){
            if(currentSum==target){
                //at base case we will have all possible subsets thus computing sum at the base case
                count++;
            }

            System.out.println(curr);

            return;
        }
        //choice one -> not taking curr element->at iteration 0 -> susbet {}
        subsets(index+1, arr,currentSum,target,curr);

        //choice two -> taking curr element -> at iteration 0->subset {2}
        curr.add(arr[index]);
        //adding current_sum with previous_current_sum
        //accumulating all sums
        //using static_count
        // to update count by total no of subsets meeting the condition
        subsets(index+1, arr,currentSum+arr[index],target,curr);

        //backtracking ->removing elements from backward
        //to trace all possible subsets
        //ie. {2,4,5, 3} possible subset would be {2,4,5,3,3}
        curr.remove(curr.size()-1);

    }

    public static void main(String[] args) {
        int[]arr={2,4,5,3};
        int target= 3;
        System.out.println(count);
      subsets(0,arr,0,target,new ArrayList<>());
        System.out.println("total no of subsets equal to target "+count);
    }
}
