package heap;

public class maxheap {

    Integer[] mahp;
    int n;

    public maxheap(int capacity){
        mahp = new Integer[capacity+1];
        n = 0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public static void main(String[] args) {
        maxheap mp = new maxheap(3);
        System.out.println(mp.isEmpty());
        System.out.println(mp.size());
    }
}
