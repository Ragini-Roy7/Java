package Arrays.LeetCode;
import java.util.*;
public class maximumWealth {
    public  static int maxWealth(int[][]accounts) {
        int rows=accounts.length;
        int maxWealth=0;
        for(int i=0;i<rows;i++){
          int  sumOfRows=0;
          for(int j = 0; j< accounts[i].length; j++) {
              sumOfRows+= accounts[i][j];
          }
            maxWealth= Math.max(maxWealth, sumOfRows);
        }
       return maxWealth;
    }

    public static void main(String[] args) {
        int[][]accounts= {{1,2,3},
                {3,4,5},
                {9,8,7}};
        int res=maxWealth(accounts);
        System.out.println(res);
    }
}
