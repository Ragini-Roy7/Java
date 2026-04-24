package src.Static_Non_Static.Greedy;
//import java.util.Arrays;
////greedy algo starts with descending order
////use min coins
//public class Coins_Needed {
//    int[] coins= {1,2,5,10};
//    int target_currency=18;
////    int found=0;
////    int n= coins.length;
////    int curr_sum=0;
//
////    for(int i=0;i<n;i++){
////         curr_sum+=coins[i];
////        if(curr_sum!=target_currency){
////            System.out.println(found);
////        }
////        //reset found to true
////        System.out.println(found);
////
////    }
//
//
//
//}

import java.util.Arrays;
//find min no coins needed to match target currency
public class Coins_Needed{
    public static void main(String[] args) {
        int[] coins= {1,2,5,10};
        int target_curr=18;
        int count=0;
        //sort the coins in descending order
        Arrays.sort(coins);
        for(int i=coins.length-1;i>=0;i--){
            target_curr-=coins[i];
            //subtracting current element from target curr
            count++;
            //to count how many coins needed
            //how many index values get added
            System.out.println("Coins used is "+coins[i]);
        }
        System.out.println("Coins Needed to make "+target_curr+ " is : "+count);
    }
}