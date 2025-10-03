public class ReverseKgroup {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Function to reverse nodes in k-group
    public ListNode reverseKGroup(ListNode head, int k) {
        int count = 0;
        ListNode ptr = head;

        // Step 1: Check if there are at least k nodes
        while (ptr != null && count < k) {
            ptr = ptr.next;
            count++;
        }

        if (count < k) {
            return head;
        }

        // Step 2: Reverse k nodes
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        for (int i = 0; i < k; i++) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        // Step 3: head becomes the end of the reversed part
        head.next = reverseKGroup(curr, k);

        return prev; // new head of this reversed segment
    }

    // Helper function to create a linked list from an array
    public static ListNode createList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : values) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper function to print linked list
    public static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) System.out.print(" -> ");
            curr = curr.next;
        }
        System.out.println();
    }

    // Main method to test
    public static void main(String[] args) {
        ReverseKgroup solution = new ReverseKgroup();

        int[] input = {1, 2, 3, 4, 5};
        int k = 2;

        ListNode head = createList(input);
        System.out.print("Original List: ");
        printList(head);

        ListNode result = solution.reverseKGroup(head, k);
        System.out.print("Reversed in " + k + "-group: ");
        printList(result);
    }
}
