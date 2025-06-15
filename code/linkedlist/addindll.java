public class addindll {
    private node head;
    private node tail;
    private int length;

    private static class node{

        private int data;
        private node next;
        private node previous;

        public node(int data){
            this.data = data;
        }
    }

    public addindll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void insertLast(int val){
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
        addindll dll = new addindll();
        dll.insertLast(12);
        dll.insertLast(14);
        dll.insertLast(16);
        dll.insertLast(18);
        dll.insertLast(20);

    }
}
