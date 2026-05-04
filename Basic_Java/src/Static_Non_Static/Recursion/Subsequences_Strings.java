package src.Static_Non_Static.Recursion;
import java.util.ArrayList;
public class Subsequences_Strings {
    static ArrayList<String> getSubsequnces(String s) {
        ArrayList<String> res = new ArrayList<>();

        //base case
        //if "" strings are there
        if(s.length()==0) {
            //means there is no strings , recursive calls can stop
            res.add("");
            return res;

        }
        //str= "abc" -> "a",, "ab", "abc", " ",
        // "b","bc", "" ,
        // "c", "ac", "a"

        char current_char= s.charAt(0);//a
        ArrayList<String>smallAns= getSubsequnces(s.substring(1));
        //substring strips off prev chars using index
        //smallAns->recursion breaking down  big problem into smaller problems
        //calc fn("bc")-> "bc", "b", "c", ""
        //res = ["ab", "a","",  "b", "bc", "",  "b", "c", ""]
        for(String ss: smallAns){
            res.add(ss);
            //current char ->calc for a
            res.add(current_char+ss);
            //all subsequences
        }

 return res;
    }

    public static void main(String[] args) {
        ArrayList<String> ans= getSubsequnces("abc");
        for(String ss: ans){
            System.out.println(ss);
        }
    }
}