package code.linkedlist;


public class DeleteMed {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;

        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to delete the middle node (to be implemented)
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode prev = null;
        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }

        prev.next = slow.next;
        return head;
    }

    // Runner method to set up the list and invoke deleteMiddle
    public void runner() {
        // Example input: [1, 2, 3, 4, 5]
        ListNode head = new ListNode(1, 
                        new ListNode(2, 
                        new ListNode(3, 
                        new ListNode(4, 
                        new ListNode(5)))));

        // Call the method
        ListNode result = deleteMiddle(head);

        // Print the result
        printList(result);
    }

    // Helper method to print the linked list
    private void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        DeleteMed dm = new DeleteMed();
        dm.runner();
    }
}
