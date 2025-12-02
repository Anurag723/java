public class SwapNode {

    // Custom linked list node
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    // Method to swap nodes in pairs
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;

        while (curr.next!=null && curr.next.next!=null) {
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            
            first.next = second.next;
            second.next = first;
            curr.next = second;

            curr = first;
        }

        return dummy.next;
    }

    // Utility method to print linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Test the code
    public static void main(String[] args) {
        SwapNode sn = new SwapNode();

        // Create example list: 1 -> 2 -> 3 -> 4
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.println("Original list:");
        sn.printList(head);

        System.out.println("After swapping:");
        ListNode newHead = sn.swapPairs(head);
        sn.printList(newHead);
    }
}
