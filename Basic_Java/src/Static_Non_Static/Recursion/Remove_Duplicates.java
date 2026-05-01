package src.Static_Non_Static.Recursion;

public class Remove_Duplicates {

    public static void remove_duplicate_strings(
            String s, int index, StringBuilder newStr, boolean[] map) {

        // base case
        if (index == s.length()) {
            System.out.println(newStr.toString());
            return;
        }

        char curr_char = s.charAt(index);

        // check duplicate
        if (map[curr_char - 'a']) {
            // duplicate → skip
            remove_duplicate_strings(s, index + 1, newStr, map);
        } else {
            // first occurrence
            map[curr_char - 'a'] = true;
            newStr.append(curr_char);
            remove_duplicate_strings(s, index + 1, newStr, map);
        }
    }

    public static void main(String[] args) {
        String s = "ragini";
        remove_duplicate_strings(s, 0, new StringBuilder(), new boolean[26]);
    }
}
