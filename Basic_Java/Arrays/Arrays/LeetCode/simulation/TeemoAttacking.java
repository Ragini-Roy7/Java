package Arrays.LeetCode.simulation;

public class TeemoAttacking {
    public static int findPoisonedDuration(int[] timeSeries, int duration) {
        if (timeSeries.length == 0) return 0;

        int total = 0;

        for (int i = 1; i < timeSeries.length; i++) {
            int diff = timeSeries[i] - timeSeries[i - 1];
            total += Math.min(diff, duration);
        }

        return total + duration;

    }

    public static void main(String[] args) {
      int[]  timeSeries ={1,4};
      int duration =2;
        System.out.println(findPoisonedDuration(timeSeries,duration));

    }
}
