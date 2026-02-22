import java.util.*;

public class Fn_Overloading {
    
    public static int sum(int a,int b){
        int res= a+b;
        return res;
    }
    public static float sum(float a,float b){
        float res= a+b;
        return res;
    }
    //function overloading user diff data  types
    public static int multiply(int a,int b){
        int res= a*b;
        return res;
    }
    public static float multiply(float a,float b){
        float res= a*b;
        return res;
    }
    public static void main(String[] args){
        //callling function
      System.out.println ( sum(78,75));
      System.out.println  (sum(67.8f,78.5f));
      System.out.println(multiply(67,34));
      System.out.println(multiply(78.32f,67.57f));
    }
}
