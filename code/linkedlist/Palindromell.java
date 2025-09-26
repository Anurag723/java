package code.linkedlist;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Palindromell {

    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) return true;

        // Find the middle of the list
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        // Reverse the second half
        ListNode secondHalf = rev(slow);
        ListNode firstHalf = head;

        // Compare both halves
        while (secondHalf != null) {
            if (firstHalf.val != secondHalf.val) {
                return false;
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true;
    }

    // Function to reverse a linked list
    public ListNode rev(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        if (arr.length == 0) return null;

        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;

        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }

        return head;
    }

    public static void main(String[] args) {
        Palindromell checker = new Palindromell();

        int[] values = {1, 2, 3, 2, 1};  // Change this array to test other cases
        ListNode head = createList(values);

        boolean result = checker.isPalindrome(head);

        if (result) {
            System.out.println("The linked list is a palindrome.");
        } else {
            System.out.println("The linked list is NOT a palindrome.");
        }
    }
}

