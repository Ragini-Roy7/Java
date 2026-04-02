package Patterns;
import java.util.*;
public class Star_2 {
    public static void main(String[] args){
        System.out.println("enter no of lines you want to print");
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        for(int i=0;i<=rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
