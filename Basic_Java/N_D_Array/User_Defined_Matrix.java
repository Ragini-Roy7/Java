package N_D_Array;
import java.util.*;

public class User_Defined_Matrix {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows");
        int rows = sc.nextInt();

        System.out.println("Enter no of cols");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];

        // Taking input
        System.out.println("Enter the elements within matrix");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Displaying matrix
        System.out.println("Matrix is:");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}