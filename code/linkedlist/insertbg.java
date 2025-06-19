public class insertbg {

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

    public insertbg(){
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

    public void print(){
        node nn = last.next;

        while (nn != last) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println(nn.data);
    }

    public void inbg(int data){
        node nn = new node(data);

        if (last==null) {
            last = nn;
            last.next = last;
        }

        else{
            nn.next = last.next;
        }

        last.next = nn;
        length++;
    }

    public static void main(String[] args) {
        
        insertbg cll = new insertbg();
        cll.createcll();
        System.out.println(cll.length);
        cll.inbg(10);

        cll.print();
    }
}