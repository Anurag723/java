public class deleteinheap {
    Integer[] mxheap;
    int n;

    public deleteinheap(int capacity){
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
        if(n==mxheap.length-1){
            resize(2*mxheap.length);
            return;
        }
        mxheap[++n] = val;
        swim(n);
    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i=0; i<mxheap.length; i++){
            temp[i] = mxheap[i];
        }
        mxheap = temp;
    }

    public void swim(int k){
        while (k>1 && mxheap[k/2]<mxheap[k]) {
            int temp = mxheap[k/2];
            mxheap[k/2] = mxheap[k];
            mxheap[k] = temp;
        }
    }

    public void printMaxHeap() {
      for (int i = 1; i <= n; i++) {
         System.out.print(mxheap[i] + " ");
      }
    }

    public int deleteMax(){
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        int max = mxheap[1];
        swap(1, n);        // Swap root with last
        mxheap[n--] = null;   // Remove last element
        sink(1);           // Restore heap property from top down

        return max;
    } 

    public void swap(int i, int j){
        int temp = mxheap[i];
        mxheap[i] = mxheap[j];
        mxheap[j] = temp;
    }

    public void sink(int k){
        while (2 * k <= n) {
            int j = 2 * k;
            if (j < n && mxheap[j] < mxheap[j + 1]) j++;
            if (mxheap[k] >= mxheap[j]) break;
            swap(k, j);
            k = j;
        
        }
    }

    public static void main(String[] args){
        deleteinheap heap = new deleteinheap(10);

        int[] values = {20, 15, 30, 40, 10, 50};

        System.out.println("Inserting elements into the heap:");
        for (int val : values) {
            heap.insert(val);
            heap.printMaxHeap();
        }

        System.out.println("\nDeleting max elements:");
        while (!heap.isEmpty()) {
            System.out.println("Deleted max: " + heap.deleteMax());
            heap.printMaxHeap();
        }
    }
}