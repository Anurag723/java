import java.util.NoSuchElementException;

class deletefstdll{
    private node head;
    private node tail;
    private int length;

    private static class node{
        private int data;
        private  node previous;
        private node next;

        public node(int data){
            this.data = data;
        }
    }

    public deletefstdll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void insfst(int val){
        node nn = new node(val);
        
        if(isEmpty()){
            tail = nn;
        }

        else{
            head.previous = nn;
        }

        nn.next = head;
        head = nn;
        length++;
    }

    public void insert(int val){
        node nn = new node(val);
        if (isEmpty()) {
            head = nn;
        }
        else{
            tail.next = nn;
        }

        nn.previous = tail;
        tail = nn;
        length++;
    }

    public node delfst(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        node temp = head;

        if (head==tail) {
            tail = null;
        }

        else{
            head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        length--;
        return temp;
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
        deletefstdll dll = new deletefstdll();
        dll.insert(12);
        dll.insert(14);
        dll.insert(16);
        dll.insert(18);
        dll.insert(20);

        dll.delfst();
        dll.print();
    }
}