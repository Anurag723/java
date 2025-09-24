package code.linkedlist;

public class DetLoop {
    private node head;

    // Linked list node structure
    private static class node {
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at end
    public void insertend(int val) {
        if (head == null) {
            head = new node(val);
            return;
        }

        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new node(val);
    }

    // Print list (limited nodes to avoid infinite loop in case of cycle)
    public void print() {
        node curr = head;
        int count = 0;
        while (curr != null && count < 20) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
            count++;
        }
        if (curr != null) {
            System.out.print("... (possible cycle detected)");
        } else {
            System.out.println("null");
        }
    }

    // ✅ Detect cycle using Floyd's Algorithm
    public boolean hasCycle() {
        node slow = head;
        node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true; // Cycle found
            }
        }

        return false; // No cycle
    }

    // 👇 Main method for testing
    public static void main(String[] args) {
        DetLoop list = new DetLoop();

        list.insertend(10);
        list.insertend(20);
        list.insertend(30);
        list.insertend(40);
        list.insertend(50);

        // Print normal list
        System.out.println("Linked List:");
        list.print();

        // ➰ Introduce a cycle manually: 50 -> 20
        // (Find node with value 50 and point it to node with value 20)
        node curr = list.head;
        node cyclePoint = null;
        while (curr.next != null) {
            if (curr.data == 20) {
                cyclePoint = curr;
            }
            curr = curr.next;
        }

        if (cyclePoint != null) {
            curr.next = cyclePoint; // Create cycle
        }

        // Test cycle detection
        System.out.println("\nCycle present? " + list.hasCycle());
    }
}
