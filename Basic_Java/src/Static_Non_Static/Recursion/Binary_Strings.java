package src.Static_Non_Static.Recursion;

public class Binary_Strings {
    public static void print_binary_strings(int n, int last_place, StringBuilder str){
        //base case if there is no string passed so no choices can be made
        //where recursive call needs to stop
        if(n==0){
            System.out.println(str);
            return;
        }
        //writing choices where 0 or 1 can sit

        //using string builder to append into it
        //string builder lives in heap
        //all recursive calls shares the same object unless we undo changes using backtracking
        //it is stored within heap memory , so references of each var is same but var names are diff unlike strings in java
        print_binary_strings(n-1,0,str.append("0"));
        if(last_place==0){
            //making 0 sit on the last place


            //making 1 sit on the last place
            print_binary_strings(n-1,1,str.append("1"));
            str.deleteCharAt(str.length()-1);
            //using backtracking to undo changes
        }
        //if at last place there is 1 , means only 0 can sit so calling it before it will execute in both the cases



    }

    public static void main(String[] args) {
        print_binary_strings(3,0,new StringBuilder());

    }
}
