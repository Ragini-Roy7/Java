package greedy;
import java.util.*;
import java.util.Arrays;
public class maxUnitsTruck {
    public static int maximumUnits(int[][] boxTypes, int truckSize) {

        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

    int totalUnits = 0;

        for (int[] box : boxTypes) {

        int take = Math.min(box[0], truckSize);

        totalUnits += take * box[1];

        truckSize -= take;

        if (truckSize == 0) {
            break;
        }
    }

        return totalUnits;
}

    public static void main(String[] args) {
        int[][]boxTypes= {{1,2}, {1,3}, {1,4}};
        int truckSize=4;
        System.out.println(maxUnitsTruck.maximumUnits(boxTypes , truckSize));
    }
}
