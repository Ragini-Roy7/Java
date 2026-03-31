package N_D_Array;
import java.util.*;

public class Diagonal_Sum {
    public static int diagonal_sum( int [][] matrix) {
//        int[][] matrix = new int[3][3];
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (i == j) {
                    //print primary diagonal sum
                    sum += matrix[i][j];
                    System.out.println("Primary sum: " + sum);
                } else if (i + j == matrix.length - 1) {
                    System.out.println("Secondary sum: " + sum);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rows");
        int rows= sc.nextInt();
        System.out.println("Enter cols:");
        int cols=sc.nextInt();

        //iterating for looping over elements while taking input
        int [][] array= new int[rows][cols];
        System.out.println("Enter elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                array[i][j]= sc.nextInt();
            }
        }

        System.out.println(diagonal_sum(array));
        sc.close();





    }
}