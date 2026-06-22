//package Arrays.LeetCode;

public class ransomenote {
    public static boolean canConstruct(String ransomNote, String magazine) {

        int[] freq = new int[26];

        // Count letters in magazine
        for (char c : magazine.toCharArray()) {
            freq[c - 'a']++;
        }

        // Check letters needed for ransomNote
        for (char c : ransomNote.toCharArray()) {
            freq[c - 'a']--;
            if (freq[c - 'a'] < 0) {
                return false;
            }
        }

        return true;
    }
}
public static void main(String[] args){
    String ransomeNote= "mango";
    String magazine= "mapango";
    System.out.println(ransomenote.canConstruct(ransomeNote, magazine));
}
