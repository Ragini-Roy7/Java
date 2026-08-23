package src.Static_Non_Static.Greedy;
import java.util.*;
public class buychocolates {
    public static int buyChoco(int[] prices, int money) {

        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < min1) {
                min2 = min1;
                min1 = price;
            }
            else if (price < min2) {
                min2 = price;
            }
        }

        int total = min1 + min2;

        if (total <= money) {
            return money - total;
        }

        return money;







    }

    public static void main(String[] args) {
        int[]prices= {1,2,3};
        int money=3;
        System.out.println(buyChoco(prices,money));
    }
}
