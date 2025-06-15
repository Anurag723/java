// code to create linked list part1(creation)

public class ll1 {

    private ListNode head;

    private static class ListNode {
    
        private int data;       //data to be kept in ll
        private ListNode next;  //address of next node

        public ListNode(int data){
            this.data = data;       //data given with linked list
            this.next = null;
        }
    }
}