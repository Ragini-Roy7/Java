public class Third_Largest_Optimized {
     public static void main(String[] args) {

        int[] arr = {2, 4, 1, 3, 5};
  //find min val in range
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int num : arr) {

            if (num > first) {
                third = second;
                second = first;
                first = num;
            }

            else if (num > second) {
                third = second;
                second = num;
            }

            else if (num > third) {
                third = num;
            }
        }

        System.out.println("Third Largest: " + third);
    }
}
