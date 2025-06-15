// code to create a doubly linked list

class doublyll{
    private node head;      //first element
    private node tail;      //last element
    private int length;     //length of linked list

    private static class node{
        private int data;
        private node next;
        private node previous;

        public node(int data){
            this.data = data;
        }
    }

    public doublyll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }
}