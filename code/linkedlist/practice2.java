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

    
}