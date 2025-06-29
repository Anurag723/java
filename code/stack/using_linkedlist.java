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
        length--;
        return res;
    }

    public int peek(){
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }
    public static void main(String[] args) {
        using_linkedlist stack = new using_linkedlist();
        stack.push(10);
        stack.push(15);
        stack.push(20);

        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
    }
}