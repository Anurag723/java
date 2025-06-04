package code.linkedlist;

class insertat {

    private node head;

    private static class node{
        private int data;
        private node next;

        private node(int x){
            this.data = x;
            this.next = null;
        }
    }

    public void print(){

        node current = head;
        while (current!=null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insert(int val, int pos){
        node nn = new node((val));
        if(pos==1){
            nn.next = head;
            head = nn;
        }

        else{
            node prev = null;
            int count = 1;

            while (count<pos-1) {
                prev = prev.next;
                count++;
            }
            node curr = prev.next;
            nn.next=curr;
            prev.next = nn;
        }
    }

    public static void main(String[] args) {
        insertat ll = new insertat();
        ll.head = new node(2);
        node second = new node(4);
        node third = new node(8);

        ll.head.next = second;
        second.next = third;
        ll.insert(6,4);
        ll.print();
    }
}