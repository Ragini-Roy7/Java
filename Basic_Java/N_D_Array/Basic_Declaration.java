package N_D_Array;


public class Basic_Declaration {
    public static void main(String[] args) {
        int[][] arr= {{6,2,0,1} , {1,3,7,2,2} , {9,9,4,5}};
        //no of cols
        for(int i=0;i<arr.length;i++) {
            for(int j=0;j<arr[0].length;j++) {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }

    }

}
