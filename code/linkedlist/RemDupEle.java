class RemDupEle {

    // Definition for singly-linked list
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    // Remove all elements that have duplicates
    static ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;

        while (curr != null) {
            // Check for duplicates
            if (curr.next != null && curr.val == curr.next.val) {
                int dupVal = curr.val;
                // Skip all nodes with duplicate value
                while (curr != null && curr.val == dupVal) {
                    curr = curr.next;
                }
                prev.next = curr;
            } else {
                prev = curr;
                curr = curr.next;
            }
        }
        return dummy.next;
    }

    // Utility method to print the list
    static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {

        // Creating sorted linked list:
        // 1 -> 2 -> 3 -> 3 -> 4 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next = new ListNode(5);

        System.out.print("Original List: ");
        printList(head);

        head = deleteDuplicates(head);

        System.out.print("After Removing Duplicates: ");
        printList(head);
    }
}
