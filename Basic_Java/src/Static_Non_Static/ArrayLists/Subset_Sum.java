package src.Static_Non_Static.ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class Subset_Sum {

    public static void generateSubsetSum(
            int index,
            int sum,
            ArrayList<Integer> arr,
            int N,
            ArrayList<Integer> result
    ) {
        if (index == N) {
            result.add(sum);
            return;
        }

        // include current element
        generateSubsetSum(index + 1, sum + arr.get(index), arr, N, result);

        // exclude current element
        generateSubsetSum(index + 1, sum, arr, N, result);
    }

    ArrayList<Integer> subsetSum(ArrayList<Integer> arr, int N) {
        ArrayList<Integer> result = new ArrayList<>();
        generateSubsetSum(0, 0, arr, N, result);
        Collections.sort(result);
        return result;
    }


public static void main(String[] args) {
        ArrayList<Integer> l= new ArrayList<>();
        l.add(2);
        l.add(5);
        l.add(1);
        l.add(8);
        int N= l.size();
        ArrayList<Integer>res= new ArrayList<>();
        generateSubsetSum(0,0,l,N,res);
    System.out.println(res);

}
    }
