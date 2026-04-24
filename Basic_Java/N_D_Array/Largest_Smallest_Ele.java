package Basic_Java.N_D_Array;
import java.util.*;

public class Largest_Smallest_Ele {
    public static int largest_element(int[][] matrix) {
        int largest_element = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] > largest_element) {
                    largest_element = matrix[i][j];
//                    return largest_element;
                }

            }
        }
        return largest_element;

    }

    public static int smallest_element(int[][] matrix) {
        int smallest_element= matrix[0][0];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++) {
                if(matrix[i][j]<smallest_element) {
                    smallest_element=matrix[i][j];
                }
            }
        }
        return smallest_element;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter rows");
        int rows= sc.nextInt();
        System.out.println("Enter cols");
        int cols= sc.nextInt();

        //input elements in matrix
        int[][] matrix= new int[rows][cols];
        System.out.println("Enter matrix elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                matrix[i][j]= sc.nextInt();
            }
        }

        //display matrix
        System.out.println("Matrix Formed:");
        for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                System.out.println(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        //calling the function
        int max_el= largest_element(matrix);
        System.out.println("Largest Element: "+max_el);
        int min_el= smallest_element(matrix);
        System.out.println("Smallest Element:"+ min_el);

        sc.close();

    }
}