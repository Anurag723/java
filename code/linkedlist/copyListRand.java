package code.linkedlist;

public class Node {
    int val;
    Node next;
    Node random;

    Node(int val) {
        this.val = val;
    }
}

public class CopyListRand {

    // Method to copy the list (logic to be implemented)
    public Node copyRandomList(Node head) {
        
        if(head==null) return null;

        Node curr = head;

        while(curr!=null){
            Node copy = new Node(curr.val);
            copy.next = curr.next;
            curr.next = copy;
            curr = copy.next;
        }

        curr = head;
        while(curr!=null){
            if(curr.random!=null){
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }

        curr = head;
        Node dummy = new Node(0);
        Node temp = dummy;

        while(curr!=null){
            temp.next = curr.next;
            temp = temp.next;

            curr.next = curr.next.next;
            curr = curr.next;
        }

        return dummy.next;
    }

    // Helper method to print the list
    private static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            String randVal = (curr.random != null) ? String.valueOf(curr.random.val) : "null";
            System.out.println("Node val: " + curr.val + ", Random points to: " + randVal);
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create sample list: 1 -> 2 -> 3
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        // Set random pointers
        n1.random = n3;  // 1 → 3
        n2.random = n1;  // 2 → 1
        n3.random = n3;  // 3 → 3 (self)

        System.out.println("Original list:");
        printList(n1);

        // Copy the list
        CopyListRand solution = new CopyListRand();
        Node copiedHead = solution.copyRandomList(n1);

        System.out.println("Copied list:");
        printList(copiedHead);
    }
}
 {
    
}
