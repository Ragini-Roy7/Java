import java.util.*;
public class Max_Row_Sum {
    public static void main(String[] args) {
        System.out.println("enter no of rows");
       Scanner sc= new Scanner(System.in);
       int rows= sc.nextInt();

        System.out.println("enter no of cols");
        int cols= sc.nextInt();

        //declaring 2d array
        int[][]arr= new int[rows][cols];
        int max_sum_row=Integer.MIN_VALUE;
        //to track which row has max index
        int maxRowIndex=-1;
        System.out.println("Enter elements within matrix");
        for(int i=0;i<rows;i++) {
            int sum=0;
            for(int j=0;j<cols;j++) {
                //sum of all the elements
                arr[i][j]=sc.nextInt();
                sum+=arr[i][j];
                if(sum> max_sum_row){
                    max_sum_row=sum;
                    maxRowIndex=i;
                }
            }
            max_sum_row= Math.max(max_sum_row,sum);
        }
        System.out.println(max_sum_row);
        System.out.println(maxRowIndex);
    }
}
