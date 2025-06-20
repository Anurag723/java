public class rmvfstcll {
    private node last;
    private int length;

    private static class node {
    
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public rmvfstcll(){
        this.last = null;
        this.length = 0;
    }

    public boolean isEmpty(){
        return length == 0;
    }

    public void insertbg(int val){
        node nn = new node(val);
        if(last == null){
            last = nn;
            last.next = last;
        }

        else{
            nn.next = last.next;
        }
        last.next = nn;
        length++;
    }

    public void insend(int val){
        node nn = new node(val);

        if(last == null){
            last = nn;
            last.next = last;
        }

        else{
            nn.next = last.next;
            last.next = nn;
            last = nn;
        }

        length++;
    }

    public void print(){
        node nn = last.next;

        while (nn!=last) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println(nn.data);
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

    public node rmvfst(){
        node nn = last.next;
        if (last.next == last) {
            last = null;
            // return last;
        }

        else{
            last.next = nn.next;
        }
        nn.next = null;
        length--;
        return nn;
    }

    public static void main(String[] args) {
        rmvfstcll cll = new rmvfstcll();
        cll.createcll();
        cll.insertbg(10);
        cll.insend(22);

        cll.rmvfst();

        cll.print();
    }
}