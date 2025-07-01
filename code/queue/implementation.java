package code.queue;

import java.util.*;

public class implementation {
    private node front;
    private node rear;
    private int length;

    public static class node{
        private int data;
        private node next;

        public node(int val){
            this.data = val;
            this.next = null;
        }
    }
    
    public implementation(){
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

    public static void main(String[] args) {
    }
}
