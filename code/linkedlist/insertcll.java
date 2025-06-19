public class insertcll {

    private node last;
    private int length;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public insertcll(){
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length==0;
    }

    public void createcll(){
        node first = new node(12);
        length++;
        node sec = new node(14);
        length++;
        node thi = new node(16);
        length++;
        node fou = new node(18);
        length++;
        node fiv = new node(20);
        length++;

        first.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fiv;
        fiv.next = first;

        last = fiv;
    }

    public static void main(String[] args) {
        
        insertcll cll = new insertcll();
        cll.createcll();
        System.out.println(cll.length);
    }
}