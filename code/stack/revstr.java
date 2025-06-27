//reverse string using stack

import java.util.*;

import javax.management.RuntimeErrorException;

public class revstr {
    private int top;
    private char[] arr;

    public revstr(int capacity){
        this.top = -1;
        arr = new char[capacity];
    }

    public revstr(){
        this(10);
    }

    public int size(){
        return top+1;
    }

    public boolean isFull(){
        return arr.length == size();
    }

    public boolean isEmpty(){
        return top<0;
    }

    public void push(char val){
        if (isFull()) {
            throw new RuntimeException("Stack already full!!!");
        }

        top++;
        arr[top] = val;
    }

    public char pop(){

        if(isEmpty()){
            throw new RuntimeException("Array already empty!!!");
        }

        char res = arr[top];
        top--;

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] arr = str.toCharArray();

        char[] res = new char[arr.length];

        revstr stack = new revstr(arr.length);

        for (int i = 0; i < res.length; i++) {
            stack.push(arr[i]);
        }

        int i = 0;

        while (!stack.isEmpty()) {
            res[i] = stack.pop();
            i++;
        }

        for (char c : res) {
            System.out.print(c);
        }
    }
}
