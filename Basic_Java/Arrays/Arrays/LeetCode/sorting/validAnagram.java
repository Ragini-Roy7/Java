package Arrays.LeetCode.sorting;
import java.util.*;
public class validAnagram {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;

        char[] a = s.toCharArray();
        char[] b = t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }

    public static void main(String[] args) {
        String s= "adhmara", t= "maraadh";
        System.out.println(isAnagram(s,t));
    }
}
