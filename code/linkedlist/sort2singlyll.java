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

    public void insert(int val){

        node nn = new node(val);
        nn.next = head;
        head = nn;
    }

    public void insend(int val){
        node nn = new node(val);

        if(head==null){
            head = nn;
        }

        node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = nn;
    }

    public void insat(int val, int pos){
        node nn = new node(val);
        if (pos==1) {
            nn.next = head;
        }

        node pre = head;
        int count = 1;

        while (count < pos-1) {
            pre = pre.next;
            count++;
        }

        node curr = pre.next;
        nn.next = curr;
        pre.next = nn;
    }

    public node delbg(){
        
        if (head==null || head.next==null) {
            return head;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node delend(){
        if (head == null || head.next == null) {
            return head;
        }

        node pre = null;
        node curr = head;

        while (curr.next != null) {
            pre = curr;
            curr = curr.next;
        }

        pre.next = null;
        return curr;
    }

    public void delat(int pos){
        if (pos==1) {
            head = head.next;
        }

        else{
            node pre = head;
            int count = 1;

            while (count<pos-1) {
                pre = pre.next;
                count++;
            }

            pre.next = pre.next.next;
        }
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