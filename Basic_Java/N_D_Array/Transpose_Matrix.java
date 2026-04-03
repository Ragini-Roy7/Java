//package N_D_Array;
import java.util.*;

public class Transpose_Matrix {
    public static void transpose_matrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] transpose = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
                System.out.println("A[" + i + "][" + j + "]-> T[" + j + "] [" + i + "]");
            }
        }
        System.out.print("Transpose Matrix :");
        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.println(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows");
        int rows = sc.nextInt();

        System.out.println("Enter no of cols");
        int cols = sc.nextInt();

        System.out.println("Enter elements");
        int[][] arr = new int[rows][cols];
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                arr[i][j]= sc.nextInt();
            }
        }
        transpose_matrix(arr);
        sc.close();

    }
}