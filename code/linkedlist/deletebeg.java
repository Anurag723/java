package code.linkedlist;

import java.util.*;

class deletebeg {

    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(){
        node nn = head;
        while (nn!= null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }


    public node dltbg(){
        if (head==null) {
            return null;
        }

        node temp = head;
        head = head.next;
        temp = null;

        return temp;
    }


    public void insertat(int val, int pos){

        node newnode = new node(val);
        if (pos==1) {
            newnode.next = head;
            head = newnode;
        }

        else{
            node prev = head;
            int count = 1;

            while (count < pos-1) {
                prev = prev.next;
                count++;
            }

            node curr = prev.next;
            prev.next = newnode;
            newnode.next = curr;
        }
    }

    public static void main(String[] args) {
        deletebeg dl = new deletebeg();
        dl.head = new node(25);
        node sec = new node(5);
        node th = new node(10);
        node fr = new node(15);
        node fi = new node(20);

        dl.head.next = sec;
        sec.next = th;
        th.next = fr;
        fr.next = fi;

        dl.insertat(0,2);
        dl.dltbg();
        dl.print();
    }
}