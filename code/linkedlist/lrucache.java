import java.util.HashMap;

class lrucache{
    
    public static class node {
        private int key, value;
        private node prev, next;
        
        public node(int key, int value){
            this.key = key;
            this.value = value;
        }
    }

    private final int capacity;
    private final HashMap<Integer, node> map;
    private final node head, tail;

    public lrucache(int cap){
        this.capacity = cap;
        map = new HashMap<>();
        this.head = new node(0, 0);
        this.tail = new node(0, 0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key){
        if (!map.containsKey(key)) {
            return -1;
        }

        node nn = map.get(key);
        remove(nn);
        insertfront(key, nn.value);
        return nn.value;
    }

    public void put(int key, int value){
        if(map.containsKey(key)){
            map.remove(key);
        }

        if (map.size() == capacity) {
            remove(tail.prev);
        }
        insertfront(key, value);
    }

    public void insertfront(int key, int value){
        node nn = new node(key, value);
        nn.next = head.next;
        head.next.prev = nn;
        head.next = nn;
        nn.prev = head;
        map.put(nn.key, nn);
    }

    public void remove(node nn){
        map.remove(nn.key);
        nn.prev.next = nn.next;
        nn.next.prev = nn.prev;
    }


    public static void main(String[] args) {
        lrucache cache = new lrucache(2);
        cache.put(1, 10);
        cache.put(2, 20);
        System.out.println(cache.get(1)); // 10
        cache.put(3, 30);                 // evicts key 2
        System.out.println(cache.get(2)); // -1
        cache.put(4, 40);                 // evicts key 1
        System.out.println(cache.get(1)); // -1
        System.out.println(cache.get(3)); // 30
        System.out.println(cache.get(4)); // 40
    }
}
