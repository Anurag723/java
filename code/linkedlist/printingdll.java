public class printingdll {
    private node head;
    private node tail;
    private int length;

    private static class node{
        private int data;
        private node previous;
        private node next;

        public node(int data){
            this.data = data;
        }

    }
    public printingdll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public void print(){
        node nn = head;

        while (nn!=null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void insert(int val){
        node nn = new node(val);
        if (isEmpty()) {
            head = nn;
        }else{
            tail.next = nn;
        }

        nn.previous = tail;
        tail = nn;
        length++;
    }

    public static void main(String[] args) {
        printingdll dll = new printingdll();
        dll.insert(12);
        dll.insert(14);
        dll.insert(16);
        dll.insert(18);
        dll.insert(20);

        dll.print();
    }
}
