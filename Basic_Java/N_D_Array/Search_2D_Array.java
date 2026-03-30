package N_D_Array;
import java.util.*;
public class Search_2D_Array {
    public static boolean search(int [][] matrix , int key){
        for(int i=0;i<matrix.length;i++) {
            for (int j = 0; j < matrix[0].length; j++) {

                if (matrix[i][j] == key) {
                    System.out.println("Element found at (" + i + "," + j + ")");
                    return true;
                }
//                return false;
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String[] args){
        int [][] matrix= new int [3] [3];
//        int n= matrix.length, m= matrix[0].length;
     //taking user input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter matrix elements:");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                matrix[i][j]= sc.nextInt();
            }
        }

        //printing the output
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        //input validation
        System.out.println("Enter key to search: ");
        while(!sc.hasNextInt()){
            System.out.println("Invalid key");
            sc.next();
            //discarding incorrect i/p type
        }
        int key=sc.nextInt();
        //calling the function
        search(matrix,5);
        sc.close();
        //closing the input


    }
}
