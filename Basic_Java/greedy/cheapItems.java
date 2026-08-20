package greedy;
import java.util.*;
import java.util.Arrays;
public class cheapItems {
   public static int maxNoItemsToBuy(int[] prices, int money) {
       Arrays.sort(prices);
       int count=0;
       for(int price:prices) {
           if(price<=money) {
               money = money - price;
               count++;
           }else {
               break;
           }
       }

       return count;
   }

    public static void main(String[] args) {
        int[] prices= {40,10,30,20,50};
        int money=70;
        System.out.println(cheapItems.maxNoItemsToBuy(prices, money));
    }
}
