package Patterns;
import java.util.*;
public class Number_Square {
    public static void main(String[] args) {
        System.out.println("enter n");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
