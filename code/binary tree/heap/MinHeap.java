class MinHeap {
    private int[] heap;
    private int size;
    private int capacity;

    MinHeap(int capacity) {
        this.capacity = capacity;
        heap = new int[capacity];
        size = 0;
    }

    private int parent(int i) { return (i - 1) / 2; }
    private int left(int i) { return 2 * i + 1; }
    private int right(int i) { return 2 * i + 2; }

    // Insert element
    public void insert(int val) {
        if (size == capacity) {
            System.out.println("Heap Overflow");
            return;
        }

        heap[size] = val;
        int curr = size;
        size++;

        // Heapify up
        while (curr > 0 && heap[curr] < heap[parent(curr)]) {
            swap(curr, parent(curr));
            curr = parent(curr);
        }
    }

    // Remove min element
    public int extractMin() {
        if (size == 0) return -1;

        int min = heap[0];
        heap[0] = heap[size - 1];
        size--;

        heapify(0);
        return min;
    }

    // Heapify down
    private void heapify(int i) {
        int smallest = i;
        int l = left(i);
        int r = right(i);

        if (l < size && heap[l] < heap[smallest])
            smallest = l;
        if (r < size && heap[r] < heap[smallest])
            smallest = r;

        if (smallest != i) {
            swap(i, smallest);
            heapify(smallest);
        }
    }

    private void swap(int i, int j) {
        int temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }
    public static void main(String[] args) {
        MinHeap heap = new MinHeap(10);

        heap.insert(10);
        heap.insert(5);
        heap.insert(30);
        heap.insert(2);

        System.out.println(heap.extractMin()); // 2
        System.out.println(heap.extractMin()); // 5
    }
}
