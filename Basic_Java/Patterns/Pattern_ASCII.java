package Patterns;
import java.util.*;

public class Pattern_ASCII {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=0;j<=n;j++){
                System.out.print((char)(j+64));
                //64 is the ASCII value
                //cols+64 ->getting converted into chars
            }
            System.out.println();
        }
    }
}
