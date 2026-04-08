package src.Static_Non_Static;
// Calling of a Non-Static Method

// Class 1
// Helper class
class Helper {

    // Non-static method
    public int sum(int a, int b)
    {
        // Returning sum of numbers
        return a + b;
    }
}

// Class 2
// Main class
class GFG {

    // Main driver method
    public static void main(String[] args)
    {
        // Input integers to be summed up
        int n = 3, m = 686;


        Helper g = new Helper();


        int s = g.sum(n, m);

        // Calling the non-static method
        System.out.print("sum is = " + s);
    }
}