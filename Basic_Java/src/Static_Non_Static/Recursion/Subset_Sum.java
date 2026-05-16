package src.Static_Non_Static.Recursion;

public class Subset_Sum {
    //approaches to solve:- using recursion -> either include the target with current array element or don`t include it
    //choice-based recursion problem types
    //method 2: - using bit manipulation
    //total subset= 2^n each subset can be represented by n bits
    //bit 1->include ele
    //bit 0->exlcude ele
    //using this, will find -> {2,6} and {2,5,1} elements subset who matched target elements
    //learn bit manipulation for deep understanding

    //method 3:- using dp where we don`t recompute the already computed values like traditional recursion
    //store pre-computed values in a var and only calc further ones
    //this is called memoization where we are reducing the call stack >from stack tree
    //reducing its time complexity from o(n^2) -> o(n)

    //recursion -> calls itself unless reach base case during its calling within stack it again calculates within tree inc its tc
    public static boolean subsetSum(int[]arr, int index, int target) {
        if (target == 0)
            return true;

        if (index == arr.length || target < 0)
            return false;
       //made choice by either including this element or excluding this element
        //include condition-> target-arr[index]
        //exclude condition->
        return subsetSum(arr, index + 1, target - arr[index]) ||
               subsetSum(arr,index+1, target);
    }




    public static void main(String[] args) {
        int[]arr= {2,5,1,8};
        System.out.println(subsetSum(arr, 0, 8));

    }
}
