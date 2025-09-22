public class MiddleOfLinkedList {

    // Definition for singly-linked list
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    // Solution class with the middleNode method
    public static class Solution {
        public ListNode middleNode(ListNode head) {
            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }
    }

    // Utility method to create a linked list from an array
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    // Utility method to print linked list from given node
    public static void printLinkedList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Main method to test the code
    public static void main(String[] args) {
        // Example input
        int[] values = {1, 2, 3, 4, 5};

        // Create linked list
        ListNode head = createLinkedList(values);

        // Print original list
        System.out.print("Original list: ");
        printLinkedList(head);

        // Find middle node
        Solution solution = new Solution();
        ListNode middle = solution.middleNode(head);

        // Print result
        System.out.print("Middle node onward: ");
        printLinkedList(middle);
    }
}
