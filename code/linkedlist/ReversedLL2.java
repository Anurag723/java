public class ReversedLL2 {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) {
            return head;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode pre = dummy;

        for(int i=1; i<left; i++){
            pre = pre.next;
        }

        ListNode curr = pre.next;
        
        for(int i=0; i<right-left; i++){
            ListNode nextNode = curr.next;
            curr.next = nextNode.next;
            nextNode.next = pre.next;
            pre.next = nextNode;
        }

        return dummy.next;
    }

    // Helper method to print the list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        head = reverseBetween(head, 2, 4);

        System.out.print("Reversed List (2 to 4): ");
        printList(head);
    }
}
