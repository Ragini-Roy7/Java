package Arrays.LeetCode;

public class mapWordsWeight {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int sum = 0;

            // calculate word weight
            for (char ch : word.toCharArray()) {
                sum += weights[ch - 'a'];
            }

            int mod = sum % 26;

            // reverse alphabetical mapping
            char mappedChar = (char) ('z' - mod);
            result.append(mappedChar);
        }

        return result.toString();
    }

}
