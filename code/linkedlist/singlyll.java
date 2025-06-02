package code.linkedlist;

public class singlyll {
    private LinkedNode head;


    private static class LinkedNode{

        private int data;
        private LinkedNode next;

        public LinkedNode(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        singlyll sl = new singlyll();
        sl.head = new LinkedNode(10);
        LinkedNode second = new LinkedNode(12);
        LinkedNode third = new LinkedNode(14);
        LinkedNode fourth = new LinkedNode(23);

        // now we have all nodes created now we have to merge these nodes to create a singly linked list...

        sl.head.next = second;      //10-->12
        second.next = third;        //10-->12-->14
        third.next = fourth;        //10-->12-->14-->23-->null;

    }
}
