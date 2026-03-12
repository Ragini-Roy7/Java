//package String;
//import java.lang.String;
//import java.util.Scanner;
//
//public class Count_Chars {
//    public static void main(String[] args) {
//      Scanner sc=new Scanner (System.in);
//        System.out.println("enter input string: ");
//      String user_input= sc.nextLine();
//      int count=0;
//      int spaces= 0;
//      int tot_chars;
//      //check cases if given input is not string
//        if(user_input.isEmpty() ) {
//            System.out.println("only strings are allowed");
//        }
//        if(user_input == null) {
//            System.out.println("given input is null .provide a string value");
//        }
//
//      for(int i=0;i<user_input.length();i++) {
//          if(user_input.charAt(i) == ' ') {
//           spaces++;
//          }
//      }
//      for(int i=0;i<user_input.length();i++) {
//          count++;
//          tot_chars= count+ spaces;
//      }
//        System.out.println("total chars in given string is : "+tot_chars);
//
//    }
//
//}
package String;
import java.util.Scanner;

public class Count_Chars {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter input string:");
        String user_input = sc.nextLine();

        if(user_input == null){
            System.out.println("Given input is null");
            return;
        }

        if(user_input.isEmpty()){
            System.out.println("Empty string entered");
            return;
        }

        int spaces = 0;

        for(int i=0;i<user_input.length();i++){
            if(user_input.charAt(i) == ' '){
                spaces++;
            }
        }

        int tot_chars = user_input.length();

        System.out.println("Total characters: " + tot_chars);
        System.out.println("Total spaces: " + spaces);

    }
}