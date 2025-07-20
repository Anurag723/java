import java.util.*;
public class Maxpq {
    Integer[] heap;
    int n;

    public Maxpq(int capacity){
        heap = new Integer[capacity];
        n = 0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {
        Maxpq mxp = new Maxpq(3);
        System.out.println(mxp.size());
        System.out.println(mxp.isEmpty());
    }
}
