import java.io.* ;
public class Reverse {
    public static void main(String[] args){
        int x=123421;
      String s= Integer.toString(x);
      int n= s.length();

      boolean isPalindrome= true;

      for(int i=0;i<n/2;i++){
        if(s.charAt(0)!=s.charAt(n-i-1)) {
            isPalindrome= false;
        break;

        }
        else {
          isPalindrome= true;
        }
      }



    }
    
}
 