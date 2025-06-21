import java.util.*;

class using_linkedlist{
    private node top;
    private int length;

    private static class node{
        private int data;
        private node next;

        public node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public using_linkedlist(){
        this.top = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void push(int data){
        node nn = new node(data);
        nn.next = top;
        top = nn;
        length++;
    }

    public int pop(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int res = top.data;
        top = top.next;
        length++;
        return res;
    }
    public static void main(String[] args) {
        
    }
}