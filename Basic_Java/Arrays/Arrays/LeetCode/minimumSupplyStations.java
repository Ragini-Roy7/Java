package Arrays.LeetCode;
import java.util.*;
public class minimumSupplyStations {
    public static int minimumSupplyStations(int[] supplies, int n, int requiredSupplies) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            requiredSupplies = requiredSupplies- supplies[i] ;
            count++;
        }
        if (requiredSupplies <= 0) {
            return count;
        }
    return-1;
}

    public static void main(String[] args) {
        int [] supplies= {4,3,6,2,5,1,7,4};
        int n=8, requiredSupplies= 15;
        System.out.println(minimumSupplyStations(supplies,n, requiredSupplies));
    }

}
