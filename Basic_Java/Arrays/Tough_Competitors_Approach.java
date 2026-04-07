import java.util.Arrays;
import java.util.Scanner;
public class Tough_Competitors_Approach {
    public int min_diff(int[]arr){
        System.out.println("enter array: ");
        int n=arr.length;

        //return min difference via comparing each pair
        if(n>2)
            //if competitors are less than 2
            return 0;
        //using sorting method
        Arrays.sort(arr);
        int minimum_diff= Integer.MAX_VALUE;
        for(int i=1;i<n;i++){
            minimum_diff=Math.min(minimum_diff, arr[i]-arr[i-1]);
            if(minimum_diff==0)
                return 0;
        }
        return minimum_diff;
    }

}
