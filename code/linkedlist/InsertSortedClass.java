class InsertSortedClass {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode lastSorted = head; 
        ListNode curr = head.next;

        while (curr != null) {
            if (lastSorted.val <= curr.val) {
                // Case 1: Already sorted, no insertion needed
                lastSorted = curr;
            } else {
                // Case 2: Need to find insertion point
                ListNode prev = dummy;

                // Find where to insert curr
                while (prev.next.val < curr.val) {
                    prev = prev.next;
                }

                // Insert curr after prev
                lastSorted.next = curr.next;
                curr.next = prev.next;
                prev.next = curr;
            }

            curr = lastSorted.next;
        }

        return dummy.next;
    }

    // Helper to create list from array
    public ListNode buildList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode cur = head;

        for (int i = 1; i < arr.length; i++) {
            cur.next = new ListNode(arr[i]);
            cur = cur.next;
        }

        return head;
    }

    // Helper to print the list
    public void printList(ListNode head) {
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            if (cur.next != null) System.out.print(" -> ");
            cur = cur.next;
        }
        System.out.println();
    }

    // Main method for testing
    public static void main(String[] args) {
        InsertSortedClass isc = new InsertSortedClass();

        int[] arr = {4, 2, 1, 3};
        ListNode head = isc.buildList(arr);

        System.out.println("Original List:");
        isc.printList(head);

        ListNode sorted = isc.insertionSortList(head);

        System.out.println("Sorted List:");
        isc.printList(sorted);
    }
}
