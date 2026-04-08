package src.Static_Non_Static.Packages;
import java.util.Random;
public class Password_Generator {
    public static void main(String[] args) {
//        Random rand= new Random();
//        int n= rand.nextInt(100);
        String chars= "ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
                "abcdefghijklmnopqrstuvwxyz"+
                "0123456789" +
                "@#%&*!";
//        System.out.println("Random Number: "+n);
        int passwordLength=8;
        Random rand= new Random();
        //importing random utility package
        String user_password= " ";
        for(int i=0;i<passwordLength;i++){
            int index= rand.nextInt(chars.length());
            //random numbers gen till chars length
            user_password+= chars.charAt(index);
        }
        System.out.println("Generated Password For You is : "+user_password);
    }

}
