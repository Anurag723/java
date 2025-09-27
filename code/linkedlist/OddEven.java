package code.linkedlist;

// ListNode class definition (assuming it's already defined as in LeetCode)
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class OddEven {
    public ListNode oddEvenList(ListNode head) {

        if(head==null || head.next==null) return head;

        ListNode curr = head.next.next;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode eve=even;
        int count=1;

        while (curr!=null) {
            if (count%2!=0) {
                odd.next=curr;
                odd = odd.next;
            }
            else{
                even.next=curr;
                even = even.next;
            }

            curr=curr.next;
            count++;
        }
        even.next=null;
        odd.next = eve;

        return head;
    }

    // Helper method to print the list (for testing purposes)
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Helper method to create a linked list from an array (for testing purposes)
    public ListNode createList(int[] arr) {
        if (arr == null || arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        OddEven solution = new OddEven();
        
        // Create a test linked list
        int[] arr = {1, 2, 3, 4, 5}; // You can change this array to test different cases
        ListNode head = solution.createList(arr);

        // Print original list
        System.out.println("Original List:");
        solution.printList(head);

        // Apply the oddEvenList method
        ListNode result = solution.oddEvenList(head);

        // Print the modified list
        System.out.println("Modified List:");
        solution.printList(result);
    }
}
