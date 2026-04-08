package src.Static_Non_Static;

    // Class 1
// Helper class
    class Helper {

        // Static method
        public static int sum(int a, int b)
        {
            return a + b;
        }
    }

    // Class 2
    class GFG {

        public static void main(String[] args)
        {
            int n = 3, m = 6;

            // Calling the static method of above class
            // and storing sum in integer variable
            int s = Helper.sum(n, m);


            System.out.print("sum is = " + s);
        }
    }
