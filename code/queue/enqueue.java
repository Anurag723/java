package code.queue;

public class enqueue {
    
    private node front;
    private node rear;
    private int length;

    public static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public enqueue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enq(int data){
        node nn = new node(data);
        
        if (isEmpty()) {
            front = nn;
        }

        else{
            rear.next = nn;
        }

        rear = nn;
        length++;
    }

    public void printqueue(){
        if (isEmpty()) {
            return;
        }

        node curr = front;

        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        enqueue queue = new enqueue();

        queue.enq(12);
        queue.enq(14);
        queue.enq(16);
        queue.enq(18);

        queue.printqueue();
    }
}