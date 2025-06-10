public class inssortedll {
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){

            this.data = data;
            this.next = null;
        }
    }

    public void print(){
        node nn = head;

        while (nn!=null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public void ins(int val){
        node nn = new node(val);

        if (head==null) {
            head = nn;
            return;
        }

        node curr = head;

        while (curr.next.data<val) {
            curr = curr.next;
        }

        node rest = curr.next;
        curr.next = nn;
        nn.next = rest;
    }

    public static void main(String[] args) {
        inssortedll dla = new inssortedll();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        dla.print();

        dla.ins(15);

        dla.print();
    }
}
