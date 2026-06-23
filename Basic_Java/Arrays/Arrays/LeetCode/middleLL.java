package Arrays.LeetCode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
public class middleLL {

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;        // move 1 step
            fast = fast.next.next;  // move 2 steps
        }

        return slow;

    }

    public static void main(String[] args) {
        // Creating linked list: 1 → 2 → 3 → 4 → 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        middleLL obj = new middleLL();
        ListNode middle = obj.middleNode(head);

        // Printing from middle node
        while (middle != null) {
            System.out.print(middle.val + " ");
            middle = middle.next;
        }

    }
}
