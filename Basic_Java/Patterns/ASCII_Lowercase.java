package Patterns;
import java.util.*;
public class ASCII_Lowercase {
    public static void main(String[] args){
        System.out.println("enter no of rows to print chars");
        Scanner sc= new Scanner(System.in);
        int rows= sc.nextInt();
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print((char)(j+97)+ " ");

            }
            System.out.println();
        }
    }
}
