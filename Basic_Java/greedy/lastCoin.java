package greedy;

import java.util.Arrays;

public class lastCoin {

    // Find the INDEX of the maximum coin
    public static int findMaxIndex(int[] coins) {

        int maxIndex = 0;

        for (int i = 1; i < coins.length; i++) {

            if (coins[i] > coins[maxIndex]) {
                maxIndex = i;
            }
        }

        return maxIndex;
    }


    // Remove the coin at the given index
    public static int[] removeElement(int[] coins, int index) {

        int[] remainingCoins = new int[coins.length - 1];

        int k = 0;

        for (int i = 0; i < coins.length; i++) {

            if (i == index) {
                //skip max index
                continue;
            }

            remainingCoins[k] = coins[i];
            k++;
        }

        return remainingCoins;
    }


    public static void main(String[] args) {

        int[] coins = {5, 3, 1, 6, 9};

        //  maximum coin's index
        int maxIndex = findMaxIndex(coins);

        System.out.println("Maximum coin: " + coins[maxIndex]);
        System.out.println("Maximum coin index: " + maxIndex);

        // Remove maximum coin
        int[] remainingCoins = removeElement(coins, maxIndex);

        System.out.println(
                "Remaining coins: " + Arrays.toString(remainingCoins)
        );
    }
}