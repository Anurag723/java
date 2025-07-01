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

    public int length(){
        return length;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void enqueue(int data){
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
            System.out.println(curr.data+"->");
            curr.next = curr;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        enqueue queue = new enqueue();

        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(16);
        queue.enqueue(18);

        queue.printqueue();
    }
}