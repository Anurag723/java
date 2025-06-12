public class sort2singlyll{
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

        while (nn != null) {
            System.out.print(nn.data+"=>");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public static node merge(node a,node b){
        node dummy = new node(0);
        node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            }

            else{
                tail.next = b;
                b = b.next;
            }

            tail = tail.next;
        }

        if (a == null) {
            tail.next = b;
        }

        else{
            tail.next = a;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        sort2singlyll dla1 = new sort2singlyll();
        dla1.head = new node(2);
        node sec = new node(4);
        node thi = new node(6);
        node fou = new node(8);

        sort2singlyll dla2 = new sort2singlyll();
        dla2.head = new node(3);
        node se = new node(5);
        node th = new node(7);

        dla1.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        dla2.head.next = se;
        se.next = th;

        sort2singlyll res = new sort2singlyll();
        res.head = merge(dla1.head, dla2.head);

        res.print();
    }
}