package POTD_LC.Recusrion;

public class StoneGameV {

    public static int stone_game(int[] stoneValue) {

        // Start recursion with the complete array
        return solve(stoneValue, 0, stoneValue.length - 1);
    }

    public static int solve(int[] stoneValue, int left, int right) {

        // Base case:
        // Only one stone remains
        if (left == right) {
            return 0;
        }

        int maxScore = 0;

        // Try every possible split
        for (int k = left; k < right; k++) {

            // Calculate left part sum
            int leftSum = 0;

            for (int i = left; i <= k; i++) {
                leftSum += stoneValue[i];
            }

            // Calculate right part sum
            int rightSum = 0;

            for (int i = k + 1; i <= right; i++) {
                rightSum += stoneValue[i];
            }

            // Left side is smaller
            if (leftSum < rightSum) {

                int score = leftSum
                        + solve(stoneValue, left, k);

                maxScore = Math.max(maxScore, score);
            }

            // Right side is smaller
            else if (rightSum < leftSum) {

                int score = rightSum
                        + solve(stoneValue, k + 1, right);

                maxScore = Math.max(maxScore, score);
            }

            // Both sides are equal
            else {

                int leftScore = leftSum
                        + solve(stoneValue, left, k);

                int rightScore = rightSum
                        + solve(stoneValue, k + 1, right);

                maxScore = Math.max(
                        maxScore,
                        Math.max(leftScore, rightScore)
                );
            }
        }

        return maxScore;
    }

    public static void main(String[] args) {

        int[] stoneValue = {6, 2, 3, 4, 5, 5};

        System.out.println(stone_game(stoneValue));
    }
}