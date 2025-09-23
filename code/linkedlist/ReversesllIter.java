package code.linkedlist;

public class ReversesllIter {
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void insertbeg(int val){
        node nn = new node(val);
        nn.next = head;
        head = nn;
    }

    public void insertend(int val){
        if(head == null){
            head = new node(val);
            return;
        }

        else{
            node curr = head;
            while(curr.next!=null){
                curr = curr.next;
            }
            curr.next = new node(val);
        }
    }

    public void insertat(int val,int pos){
        node nn=new node(val);
        if (pos==1) {
            nn.next = head;
            head = nn;   
        }
        else{
            node curr = head;
            int count = 1;

            while(count<pos-1){
                curr = curr.next;
            }
            node temp = curr.next;
            curr.next = nn;
            nn.next = temp;
        }
    }

    public node rev(){
        node pre = null;
        node curr = head;
        node next = null;

        while (curr!=null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public void print(node head){
        node nn = head;

        while (nn!= null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }

        System.out.println("null");
    }

    public node delbg(){
        if (head==null || head.next==null) {
            return head;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node delen(){
        if(head==null || head.next==null){
            return head;
        }

        node pre = head;
        node res = null;
        while (pre.next!=null) {
            res = pre;
            pre = pre.next;
        }

        res.next = null;
        return pre;
    }

    public void delat(int pos){
        if (pos==1) {
            head = head.next;
            return;
        }
        else{
            node pre = head;
            int count =1;
            while (count<pos-1) {
                pre = pre.next;
            }
            node curr = pre.next;
            pre.next = curr.next;
        }
    }
    public static void main(String[] args) {
        ReversesllIter list = new ReversesllIter();

        // Insert elements
        list.insertbeg(10);  // List: 10
        list.insertbeg(20);  // List: 20 -> 10
        list.insertend(30);  // List: 20 -> 10 -> 30
        list.insertat(25, 3);  // List: 20 -> 10 -> 25 -> 30

        System.out.println("Original List:");
        list.print(list.head);

        // Reverse the list
        list.head = list.rev();
        System.out.println("Reversed List:");
        list.print(list.head);

        // Delete the first node (beginning)
        list.delbg();
        System.out.println("After deleting from beginning:");
        list.print(list.head);

        // Delete the last node (end)
        list.delen();
        System.out.println("After deleting from end:");
        list.print(list.head);

        // Delete the node at position 2
        list.delat(2);
        System.out.println("After deleting at position 2:");
        list.print(list.head);
    }
}
