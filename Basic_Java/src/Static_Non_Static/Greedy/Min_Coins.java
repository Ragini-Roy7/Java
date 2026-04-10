package src.Static_Non_Static.Greedy;
import java.util.Arrays;


public class Min_Coins {
    public void min_coins(int []coins,int target_currency) {
        for (int i = coins.length-1; i >= 0; i--) {
            if (target_currency >= coins[i]) {
                int count = target_currency / coins[i];
                target_currency = target_currency % coins[i];
                System.out.printf("%4d x %2d | Remaining = %4d%n",
                        coins[i], count, target_currency);

            }
        }

    }
    public static void main(String[] args) {
        int[] coins = {1, 2, 5, 10, 20, 50, 100};
        int target = 93;

        Min_Coins obj = new Min_Coins();
        obj.min_coins(coins, target);
    }
}
