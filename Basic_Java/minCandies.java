import java.util.*;
public class minCandies {
    public static int distributeCandies(int[] candyType) {

        HashSet<Integer> set = new HashSet<>();

        for (int candy : candyType) {
            set.add(candy);
        }

        return Math.min(set.size(), candyType.length / 2);
    }

    public static void main(String[] args) {
        int[]candyType= {1,1,2,2};
        System.out.println(distributeCandies(candyType));
    }
}
