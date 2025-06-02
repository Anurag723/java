package code.linkedlist;

// import java.util.*;

public class printsll {
    
    private linkednode head;

    private static class linkednode {
    
        private int data;
        private linkednode next;

        public linkednode(int data){
            this.data = data;
            this.next = null;
        }

    }

    public void printll(){
        linkednode current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        printsll psl = new printsll();
        psl.head = new linkednode(10);
        linkednode second = new linkednode(12);
        linkednode third = new linkednode(14);
        linkednode fourth = new linkednode(16);

        psl.head.next = second;
        second.next = third;
        third.next = fourth;

        psl.printll();
    }
}
