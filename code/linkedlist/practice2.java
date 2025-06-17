// Revision work
//create a doubly linked list
class practice2{
    private node head;
    private node tail;
    private int length;

    private static class node{
        private int data;
        private int prev;
        private int next;

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
    
}