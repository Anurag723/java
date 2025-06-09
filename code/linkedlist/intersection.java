public class intersection {
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public void print(node head){
        node curr = head;

        while (curr!=null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void insbg(int val){
        node nn = new node(val);

        nn.next = head;
        head = nn;
    }

    public void insend(int val){
        node nn = new node(val);

        if (head==null) {
            head = nn;
            return;
        }

        node pre = head;
        while (pre.next!=null) {
            pre = pre.next;
        }

        pre.next = nn;
    }

    public void insat(int val, int pos){
        node nn = new node(val);

        if (pos==1) {
            nn.next = head;
            head = nn;
        }

        else{
            node pre = head;
            int count = 1;

            while (count<pos-1) {
                pre = pre.next;
            }

            node curr = pre.next;
            nn.next = curr;
            pre.next = nn;
        }
    }

    public node delbeg(){
        if (head==null || head.next==null) {
            return head;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node delend(){
        if (head==null || head.next==null) {
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
            }
            node curr = pre.next;
            pre.next = curr.next;
        }
    }

    public node rev(node head){
        node curr = head;
        node pre = null;
        node next = null;

        while (curr.next!=null) {
            next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }

        return pre;
    }

    public int inter(node h1, node h2){
        if (h1==null || h2==null) {
            return 0;
        }

        node p1 = h1;
        node p2 = h2;

        while (p1!=p2) {
            if (p1==null) {
                p1 = h2;
            }

            else{
                p1 = p1.next;
            }

            if (p2==null) {
                p2 = h1;
            }

            else{
                p2 = p2.next;
            }
        }

        return p1.data;
    }

    public static void main(String[] args) {
        intersection dla = new intersection();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);
        node fi = new node(20);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fi;

        intersection ll = new intersection();
        ll.head = new node(2);
        node second = new node(4);

        ll.head.next = second;
        second.next = thi;
        

        System.out.println(ll.inter(dla.head, ll.head));
    }
}
