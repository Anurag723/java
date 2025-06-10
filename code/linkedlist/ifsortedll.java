public class ifsortedll {
    private node head;

    private static class node {
    
        private int data;
        private node next;

        public node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public void inbg(int val){
        node nn = new node(val);

        nn.next = head;
        head = nn;
    }

    public void inen(int val){
        node nn = new node(val);

        if (head==null) {
            nn.next = head;
            head = nn;
        }

        node curr = head;
        while (curr.next!=null) {
            curr = curr.next;
        }

        curr.next = nn;
    }
    
    public void inat(int val, int pos){
        node nn = new node(val);

        if (pos==1) {
            nn.next = head;
            head = nn;
        }

        else{
            node pre = head;
            int count = 1;

            while (count<pos) {
                pre = pre.next;
                count++;
            }

            node curr = pre.next;
            nn.next = curr;
            pre.next = nn;
        }
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

    public node delen(){
        if (head==null||head.next==null) {
            return head;
        }

        node curr = head;
        node pre = null;
        while (curr.next!=null) {
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

            pre.next = pre.next.next;
        }
    }

    public boolean issorted(){
        node nn = head;
        while (nn.next!=null) {
            if (nn.data>nn.next.data) {
                return false;
            }

            nn = nn.next;
        }

        return true;
    }

    public static void main(String[] args) {
        ifsortedll dla = new ifsortedll();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        System.out.println(dla.issorted());
    }
}
