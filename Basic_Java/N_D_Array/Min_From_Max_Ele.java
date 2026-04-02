//public class Min_From_Max_Ele {
//    public static void main(String[] args) {
//        int[][] arr= {{2,8,3,4,7},
//                {7,2,1,6,3},
//                {5,5,4,1,4},
//                {3,1,8,2,6}};
//        int rows= arr.length;
//        int cols= arr[0].length;
//      int max_ele_row= arr[i][0];
//
//       for(int i=0;i<=rows;i++) {
//           int max_ele_row= arr[i][0];
//           for(int j=1;j<cols;j++) {
//               if(arr[j][i]>arr[i][j]) {
//                   //update the max_ele
//                  max_ele_row= arr[i][j];
//               }
//           }
//           int minOfMax= max_ele_row; //storing first row_max
//           for(int j=1;j<rows;i++){
//               if(arr[i][j]>max_ele_row){
//                   max_ele_row=arr[i][j];
//               }
//           }
//           //comparing current row max with prev min
//           if(max_ele_row<minOfMax){
//               minOfMax=max_ele_row;
//           }
//       }
//        System.out.println("smallest among row-wise max ele: "+minOfMax);
//
//
//    }
//}
public class Min_From_Max_Ele {

    public static void main(String[] args) {

        int[][] arr = {
                {2, 8, 3, 4, 7},
                {7, 2, 1, 6, 3},
                {5, 5, 4, 1, 4},
                {3, 1, 8, 2, 6}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        // STEP 1: find max of first row
        //considering first row,col as max
        int rowMax = arr[0][0];
        for (int j = 1; j < cols; j++) {
            if (arr[0][j] > rowMax) {
                rowMax = arr[0][j];
            }
        }

        int minOfMax = rowMax;   // storing first row max

        // STEP 2: process remaining rows
        for (int i = 1; i < rows; i++) {

            rowMax = arr[i][0];   // resetting each time

            for (int j = 1; j < cols; j++) {
                if (arr[i][j] > rowMax) {
                    rowMax = arr[i][j];
                }
            }

            // compare current row max with prev min
            if (rowMax < minOfMax) {
                minOfMax = rowMax;
            }
        }

        System.out.println("Smallest among row-wise maximum elements = " + minOfMax);
    }
}
