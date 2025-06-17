// Revision work
//create a doubly linked list
class practice2{
    private node head;
    private node tail;
    private int length;

    private static class node{
        private int data;
        private node prev;
        private node next;

        public node(int data){
            this.data = data;
        }
    }

    public practice2(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    //insert in dll

    public void insert(int data){
        node nn = new node(data);

        if (isEmpty()) {
            head = nn;
        }

        else{
            tail.next = nn;
        }
        nn.prev = tail;
        tail = nn;
        length++;
    }

    //insert at beginning
    public void insbg(int val){
        node nn = new node(val);

        if (isEmpty()) {
            tail = nn;
        }

        else{
            head.prev = nn;
        }
        nn.next = head;
        head = nn;
        length++;
    }

    public void print(){
        node nn = head;

        while (nn!=null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        practice2 dll = new practice2();
        
        dll.insbg(12);
        dll.insbg(14);
        dll.insbg(16);
        dll.insbg(18);
        dll.insbg(20);

        dll.print();
    }
}