import java.util.Scanner;
public class Arr {
  
    //creating scanner class to take input from user
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter size of array\n");
        int n=sc.nextInt(); 

        int[] arr= new int[n];

        System.out.println("enter" + n  +"of elements in array");
        //giving elements
        for(int i=0;i<n;i++) {
        //storing input in array
            arr[i]= sc.nextInt();
        }
        System.out.println("array elements are:");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+ " ");
        }
        sc.close();
   }
    
}
