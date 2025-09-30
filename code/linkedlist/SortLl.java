package code.linkedlist;



public class SortLl {

    // Definition for singly-linked list.
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Sort function using merge sort
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode premid = middle(head);
        ListNode mid = premid.next;
        premid.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(mid);

        return merge(left, right);
    }

    // Find the node before the middle to split the list
    public ListNode middle(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while (fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        return prev;
    }

    // Merge two sorted linked lists
    public ListNode merge(ListNode left, ListNode right){
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;

        while (left != null && right != null){
            if (left.val <= right.val){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        temp.next = (left != null) ? left : right;

        return dummy.next;
    }

    // Helper function to print the linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + (head.next != null ? " -> " : ""));
            head = head.next;
        }
        System.out.println();
    }

    // Main method to run and test the sort
    public static void main(String[] args) {
        SortLl solution = new SortLl();

        // Create unsorted list: 4 -> 2 -> 1 -> 3
        ListNode node4 = new ListNode(3);
        ListNode node3 = new ListNode(1, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(4, node2);

        System.out.print("Original list: ");
        solution.printList(node1);

        ListNode sorted = solution.sortList(node1);

        System.out.print("Sorted list:   ");
        solution.printList(sorted);
    }
}
