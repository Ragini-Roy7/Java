package String;
import java.lang.String;
public class String_Interning {
    public  static void main(String[] args) {
        //strings in java are immutable by design
        //ensures thread safety and hashcode caching
        String str= "Hello";
        String str2= "Hello";
        //strings in java are objects
        // both points to same object

        System.out.println(str+str2);
        System.out.println("str==str2 ?" + (str==str2));
        System.out.println("str: " + str + "str2 : "+str2);
        //modifying strings
         str= str2 + "Strings";
        System.out.println("After modification\n");
        System.out.println("str==str2 ? "+ (str==str2));
        //false
        //str var now points to new object
        //using intern() method
        String str3= new String("Hello").intern();
        System.out.println("Interned string equals pooled literals "+(str2==str3));

    }
}
