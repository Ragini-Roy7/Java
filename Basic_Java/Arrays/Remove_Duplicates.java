import java.util.*;
public class Remove_Duplicates {
    static void remove_duplicates(String str, int index, StringBuilder newStr, boolean []map){
        //using map
        if(index==str.length()){
            System.out.println(newStr.toString());
            //converting string builder to string
            //newStr which is  of string builder type is having res
            return;
        } //base case

        //create a map[] bool to connect strings to it
        //to find the current char
        //using type conversions in expression
        char curr_char= str.charAt(index);
        int mapping_index= curr_char - 'a';
           if(map[mapping_index]){
               //current char is duplicate
               //don`t include into new string which is created by StringBuilder
               //call the fn
               remove_duplicates(str,index+1, newStr,map);

           }else {
               //unique values
               map[curr_char-'a']=true;
               remove_duplicates(str, index+1, newStr.append(curr_char),map);
           }


    }

    public static void main(String[] args) {
        String str= "Programming";
        str= str.toLowerCase();
     remove_duplicates(str,0, new StringBuilder(" "),new boolean [26]);

    }

}

