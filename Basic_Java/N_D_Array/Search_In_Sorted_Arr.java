package N_D_Array;

public class Search_In_Sorted_Arr {
    public static void main (String[] args) {
        int key=33;
        int[][] matrix= {
                {10,20,30,40},
                {15,25,35,45},
                {27,29,37,48},
                {32,33,39,50}};

        int rows=0,col= matrix[0].length-1;

        //if key is greater than cell-> move towards RIGHT
       while(rows<matrix.length && col>=0) {
           //rows will run till length
           if(matrix[rows][col] ==key) {
               System.out.println("Key found at ("+ rows+ " "+col+")");
             return;
           }
           else if(key< matrix[rows][col]) {
               //key value is less than rows and cols
               //so move backwards
               //matrix is already sorted
               //value must lie in backward direction (iterating backwards)
               col--;
           }
           else {
               //key is greater than rows and cols
               //so move upwards
               rows++;
           }
//           break;

       }
        System.out.println("key not found!");

        }
    }

