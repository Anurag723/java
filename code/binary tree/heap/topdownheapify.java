public class topdownheapify {
    Integer[] mhp;
    int n;

    public topdownheapify(int capacity){
        mhp = new Integer[capacity+1];
        n=0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void insert(int val){
        if(n==mhp.length-1){
            resize(2*mhp.length);
            return;
        }

        mhp[++n] = val;
        swim(n);
    }

    public void swim(int k){
        while(k>1 && mhp[k]>mhp[k/2]){
            int temp = mhp[k];
            mhp[k] = mhp[k/2];
            mhp[k/2] = temp;
        }
    }

    private void resize(int capacity) {
        Integer[] temp = new Integer[capacity];
        for(int i=1; i<mhp.length; i++) temp[i] = mhp[i];
        mhp = temp;
    }


    public void printMaxHeap() {
      for (int i = 1; i <= n; i++) {
         System.out.print(mhp[i] + " ");
      }
    }

    // Top down heapify used in deletion also known as sink function

    public void sink(int k){
        while (2*k<=n) {
            int j = 2*k;

            if (j<n && mhp[j]<mhp[j+1]) {
                j++;
            }

            if(mhp[k]>mhp[j]) break;

            swap(k,j);
            k=j;
        }
    }

    public int deleteMax(){
        if (isEmpty()) {
            throw new RuntimeException("Heap is empty");
        }

        int max = mhp[1];
        swap(1, n);        // Swap root with last
        mhp[n--] = null;   // Remove last element
        sink(1);           // Restore heap property from top down

        return max;
    }

    private void swap(int i, int j) {
        int temp = mhp[i];
        mhp[i] = mhp[j];
        mhp[j] = temp;
    }
    

    public static void main(String[] args){
        topdownheapify heap = new topdownheapify(5);

        heap.insert(10);
        heap.insert(20);
        heap.insert(5);
        heap.insert(30);
        heap.insert(15);

        System.out.print("Heap after insertions: ");
        heap.printMaxHeap(); // Expected max heap order

        System.out.println("Deleted max: " + heap.deleteMax());
        System.out.print("Heap after deleting max: ");
        heap.printMaxHeap();
    }
}
