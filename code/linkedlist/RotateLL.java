public class RotateLL {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    // Method to rotate the linked list
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;
        
        ListNode curr = head;
        int len = 1;

        while (curr.next!=null) {
            curr = curr.next;
            len++;
        }

        k=k%len;
        if(k==0) return head;

        ListNode tail = head;
        for(int i=1; i<len-k;i++){
            tail = tail.next;
        }

        ListNode res = tail.next;

        tail.next = null;
        curr.next = head;

        return res;
    }


    // Helper method to print the list for testing
    public void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
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
        RotateLL rotateLL = new RotateLL();
        
        // Example input
        int[] nums = {1, 2, 3, 4, 5};
        int k = 2;

        // Create linked list
        ListNode head = rotateLL.createList(nums);

        // Print original list
        System.out.println("Original List:");
        rotateLL.printList(head);

        // Call the rotateRight method (implement later)
        ListNode rotatedList = rotateLL.rotateRight(head, k);

        // Print rotated list
        System.out.println("Rotated List:");
        rotateLL.printList(rotatedList);
    }
}
