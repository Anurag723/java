package code.linkedlist;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LoopLength {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return null;
        }

        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            // Cycle detected
            if (slow == fast) {
                // Step 2: Find the start of the cycle
                ListNode start = head;
                while (start != slow) {
                    start = start.next;
                    slow = slow.next;
                }
                return start; // This is the start of the cycle
            }
        }

        return null; // No cycle
    }

    // Helper method to create a linked list with a cycle for testing
    public static ListNode createLinkedListWithCycle(int[] values, int pos) {
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleEntry = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            if (i == pos) {
                cycleEntry = current;
            }
        }

        if (pos != -1) {
            current.next = cycleEntry;
        }

        return head;
    }

    public int findLoopLength(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (fast == slow) {
                // Loop detected, now find its length
                int loopLength = 1;
                ListNode current = slow.next;
                while (current != slow) {
                    loopLength++;
                    current = current.next;
                }
                return loopLength;
            }
        }

        return 0; // No loop
    }

    public static void main(String[] args) {
        // Example: Create a list [3, 2, 0, -4] with a cycle starting at node index 1 (value 2)
        int[] values = {3, 2, 0, -4};
        int pos = 1; // Index of the node where the cycle starts

        LoopLength loopLengthFinder = new LoopLength();
        ListNode head = createLinkedListWithCycle(values, pos);

        // Detect the start of the cycle
        ListNode cycleStart = loopLengthFinder.detectCycle(head);
        if (cycleStart != null) {
            System.out.println("Cycle starts at node with value: " + cycleStart.val);
        } else {
            System.out.println("No cycle detected.");
        }

        // Find the length of the cycle
        int loopLength = loopLengthFinder.findLoopLength(head);
        System.out.println("Length of the loop: " + loopLength);
    }


}
