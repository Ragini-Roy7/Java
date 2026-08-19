package greedy;
import org.w3c.dom.ls.LSOutput;

import java.util.*;
import java.util.Arrays;
public class maxNoItems {
    public static int maxNoItemsBought(int[] prices, int money) {
        //sort the food items by prices
        //pick up the least
        Arrays.sort(prices);
        //count no of items purchased
        int count = 0;
        for (int price : prices) {
            if (price <= money) {
                //update money
                //buy the given item
                money = money - price;
                System.out.println(money);
                count++;
            } else {
                break;
                //after buying any item for 80 rs none can be bought so stop it
            }
        }
        return count;
    }

    public static void main(String[] args) {


        int[] prices = {80, 50, 30, 20};
        int money = 100;
        System.out.println(maxNoItemsBought(prices, money));
    }
}