public class insrtbgdll {
    private node head;
    private node tail;
    private int length;

    private static class node {
    
        private int data;
        private node next;
        private node previous;
    
        public node(int data){
            this.data = data;
        }
    }

    public insrtbgdll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void insertatend(int val){
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

    public void insrtbg(int val){
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

    public void print(){
        node nn = head;
        while (nn!=null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        insrtbgdll dll = new insrtbgdll();
        dll.insertatend(14);
        dll.insertatend(16);
        dll.insertatend(18);
        dll.insertatend(20);

        dll.insrtbg(12);
        dll.print();
    }
}