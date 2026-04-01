//package N_D_Array;
import java.util.*;

public class Sum_Elements_Matrix {
    public static void main(String[] args) {
        System.out.println("Enter no of rows");
        Scanner sc= new Scanner(System.in);
        int rows=sc.nextInt();

        System.out.println("Enter no of cols");
        int cols= sc.nextInt();
        int[][] matrix=new int [rows][cols];
        int sum=0;

        //ask user to enter elements
        System.out.println("Enter elements within matrix");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                matrix[i][j]=sc.nextInt();
                sum= sum+matrix[i][j];

            }
        }
        System.out.println("Sum is : "+sum);
    }
}
