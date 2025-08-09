public class insertmxheap {
    Integer[] mxheap;
    int n;

    public insertmxheap(int capacity){
        mxheap = new Integer[capacity+1];
        n=0;
    }

    public boolean isEmpty(){
        return n==0;
    }

    public int size(){
        return n;
    }

    public void insert(int val){
        if (n==mxheap.length-1) {
            resize(2*mxheap.length);
            return;
        }

        n++;
        mxheap[n] = val;
        swim(n);
    }

    public void swim(int k){
        while (k>1 && mxheap[k]>mxheap[k/2]) {
            int temp = mxheap[k];
            mxheap[k] = mxheap[k/2];
            mxheap[k/2] = temp;
        }
    }

    public void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i=1; i<mxheap.length; i++) temp[i] = mxheap[i];
        mxheap = temp;
    }

    public void printMaxHeap() {
      for (int i = 1; i <= n; i++) {
         System.out.print(mxheap[i] + " ");
      }
   }

   public static void main(String[] args) {
        insertmxheap heap = new insertmxheap(3);

        heap.insert(10);
        heap.insert(5);
        heap.insert(20);
        heap.insert(15);
        heap.insert(30); // This should trigger resize

        System.out.println("Max Heap Elements:");
        heap.printMaxHeap();

   }
}
