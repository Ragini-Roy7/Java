package src.Static_Non_Static.Recursion;
import java.util.Stack;

public class Sort_Stack {

    // Function to sort the stack
    public static void sortStack(Stack<Integer> st) {
        // Base case
        if (st.isEmpty()) {
            return;
        }

        // Step 1: Remove top element
        int top = st.pop();

        // Step 2: Sort remaining stack
        sortStack(st);

        // Step 3: Insert removed element at correct position
        insertInSortedOrder(st, top);
    }

    // Helper function to insert element in descending order
    private static void insertInSortedOrder(Stack<Integer> st, int element) {

        // Base case:
        // stack empty OR top element >= element
        if (st.isEmpty() || st.peek() >= element) {
            st.push(element);
            return;
        }

        // Remove top and recurse
        int top = st.pop();
        insertInSortedOrder(st, element);

        // Restore element
        st.push(top);
    }

    // Testing
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(1);
        st.push(3);
        st.push(2);

        sortStack(st);

        System.out.println(st); // [4, 3, 2, 1]
    }
}
