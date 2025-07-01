package code.queue;

import java.util.NoSuchElementException;

public class dequeue {
    private node front;
    private node rear;
    private int length;

    public static class node{
        private int data;
        private node next;

        public node(int val){
            this.data = val;
        }
    }

    public dequeue(){
        this.front = null;
        this.rear = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public int length(){
        return length;
    }

    public void enq(int data){
        node nn = new node(data);

        if(isEmpty()){
            front = nn;
        }

        else{
            rear.next = nn;
        }
        rear = nn;
        length++;
    }

    public int deq(){
        if (isEmpty()) {
            throw new NoSuchElementException("Queue is already empty");
        }

        int res = front.data;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        length--;
        return res;
    }

    public void print(){
        node curr = front;
        
        if (isEmpty()) {
            return;
        }

        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        dequeue queue = new dequeue();

        queue.enq(12);
        queue.enq(14);
        queue.enq(16);
        queue.enq(18);

        queue.print();

        queue.deq();

        queue.print();
    }
}