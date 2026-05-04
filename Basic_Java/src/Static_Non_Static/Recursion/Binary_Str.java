package src.Static_Non_Static.Recursion;
import java.lang.String;
//using strings
public class Binary_Str {
    public static void print_binaryStrings(int n, int last_place, String str){

        //base case if no strings
        if(n==0){
            System.out.println(str);
            return;
        }
        print_binaryStrings(n-1,0,str+"0");
        //if last_place has 0
        //two possibility either 1 or 0
        if(last_place==0){
            //appending 0 into strings
            print_binaryStrings(n-1,0,str+"1");
        }
        //in else part, it is understood n`s last place would be
    }

    public static void main(String[] args) {
        print_binaryStrings(4, 0, "");
    }
}
