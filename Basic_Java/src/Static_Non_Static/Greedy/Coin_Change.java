package Basic_Java.src.Static_Non_Static.Greedy;
import java.util.Arrays;
//public class Coin_Change {
//    public class
//
//    int Coin_Change() {
//        int[] coins = {1, 2, 5};
//        //can assume infinite no of coins of each kind
//        //return -1 if none matches
//        //0 for 0rs amount no coins needed
//        //handle edge cases
//        //sort the coins to find larget coin
//        int count = 0;
//        int curr_coin = 0;
//        int target_coin = 11;
//        int sum = 0;
//        int remaining_amount = 0;
//        Arrays.sort(coins);
//        for (int i = coins.length - 1; i >= 0; i--) {
//
//            target_coin -= curr_coin;
//            //find those whose count can lead to finding remaining elements
//            //here 1+2=3 after 1,2,5=8 +3 ==11
//            //but note this is not min no of coins needed
//            //its possible no coins only
//            if (curr_coin < target_coin) {
//                //find remaining elements
//                for (int j = 0; j < coins.length - 1; i = j++) {
//                    sum += coins[i];
//                    remaining_amount = target_coin - sum;
////                    count++;
//                }
//                return count;
//            }
//
//
//        }
//
//
//        public static void main (String[]args){
//
//        }
//    }
//}

import java.util.Arrays;

public class Coin_Change {

    static int minCoins = Integer.MAX_VALUE;

    static void findWays(int[] coins, int remaining, int count) {

        // base case: exact match
        if (remaining == 0) {
            minCoins = Math.min(minCoins, count);
            return;
        }

        // invalid path
        if (remaining < 0) {
            return;
        }

        // try all coins (repetition allowed)
        for (int i = 0; i < coins.length; i++) {
            findWays(coins, remaining - coins[i], count + 1);
        }
    }

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int target = 11;

        Arrays.sort(coins);

        if (target == 0) {
            System.out.println(0);
            return;
        }

        findWays(coins, target, 0);

        if (minCoins == Integer.MAX_VALUE) {
            System.out.println(-1);
        } else {
            System.out.println("Minimum coins needed = " + minCoins);
        }
    }
}