import java.util.*;
public class practice3 {
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printll(){
        node nn = head;

        while (nn != null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public void insbg(int data){
        node nn = new node(data);
        nn.next = head;
        head = nn;
    }

    public void insed(int data){
        node nn = new node(data);
        if (head==null) {
            head = nn;
            return;
        }

        node curr = head;

        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = nn;
    }

    public void insat(int val, int pos){
        node nn = new node(val);
        if (pos==1) {
            nn.next = head;
            head = nn;
        }

        node pre = head;
        int count = 1;

        while (count<pos-1) {
            pre = pre.next;
            count++;
        }

        node curr = pre.next;
        nn.next = curr;
        pre.next = nn;
    }

    public node deletefst(){
        if (head == null || head.next == null) {
            return head;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node deleteend(){
        if (head==null || head.next==null) {
            return head;
        }

        else{
            node curr = head;
            node pre = null;

            while (curr.next != null) {
                pre = curr;
                curr = curr.next;
            }
            pre.next = null;
            return curr;
        }
    }

    public void delbypos(int pos){
        if (pos==1) {
            head = head.next;
        }

        else{
            node curr =  head;
            int count = 1;

            while (pos-1>count) {
                curr = curr.next;
                count++;
            }

            curr.next = curr.next.next;
        }
    }

    public void delkey(int val){
        node curr = head;
        
        while (curr!=null && curr.next!=null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
                
            }
            curr = curr.next;
        }
    }
}


class doubll{
    private node head;
    private node tail;
    private int length;

    private static class node{
        private int data;
        private node next;
        private node prev;

        public node(int data){
            this.data = data;
        }
    }
    public doubll(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void insbg(int data){
        node nn = new node(data);

        if (isEmpty()) {
            tail = nn;
        }

        else{
            head.prev = nn;
        }
        nn.next = head;
        head = nn;
        length++;
    }

    public void insend(int val){
        node nn = new node(val);

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

    public node delfstdll(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        node temp = head;

        if (head == tail) {
            tail = null;
        }

        else{
            head.next.prev = null;
        }
        head = head.next;
        temp.next = null;
        length--;

        return temp;
    }

    public node delend(){
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        node temp = tail;

        if (head == tail) {
            head = null;
        }

        else{
            tail.prev.next = null;
        }
        tail = tail.prev;
        temp.prev = null;
        length--;

        return temp;
    }

    public void print(){
        node nn = head;

        while (nn != null) {
            System.out.print(nn.data);
            nn = nn.next;
        }
        System.out.println("null");
    }
}