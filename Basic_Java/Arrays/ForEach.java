package Arrays;

public class ForEach {
    public static void main(String[] args) {
        int  [][]arr= {{1,2,3},
                {5,6,7,6,3,2}};
        int sum=0;

        for(int row[]:arr) {
            for(int item:row) {

                System.out.print(item + " ");
                sum= sum+item;
            }
            System.out.println();
            System.out.println("Sum is:"+sum);
        }

    }
}
