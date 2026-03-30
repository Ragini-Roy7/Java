package N_D_Array;
import java.util.Scanner;


public class Two_D_Array {
    public static void main(String args[]) {
        int [][] matrix =new int [2] [2];
//        int rows=2, cols=2;
        int rows= matrix.length, cols= matrix[0].length;

        System.out.println("Enter elements within matrix");
        //taking input from user
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++) {
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix:");

        //printing output
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
