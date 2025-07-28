package heap;

public class bottomupheapify {
    Integer[] mxheap;
    int n = 0;

    public bottomupheapify(int capacity){
        mxheap = new Integer[capacity+1];
        n = 0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void insert(int val){
        if (n==mxheap.length-1) {
            System.out.println("overflow condition");
            return;
        }

        mxheap[++n] = val;
        swim(n);
    }

    public void swim(int k){
        while (k>1 && mxheap[k]>mxheap[k/2]) {
            swap(k, k/2);
            k=k/2;
        }
    }

    private void swap(int i, int j){
        int temp = mxheap[i];
        mxheap[i] = mxheap[j];
        mxheap[j]=temp;
    }

    public void printHeap() {
        for (int i = 1; i <= n; i++) {
            System.out.print(mxheap[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        bottomupheapify heap = new bottomupheapify(10);
        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30);

        heap.printHeap();
    }
}
