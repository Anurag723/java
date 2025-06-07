public class revsll {
    private node head;

    public static class node{
        private int data;
        private node next;

        public node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public node rev(node head){
        node curr = head;
        node prev = null;
        node next = null;

        while (curr!=null) {
            next = curr.next;
            curr.next=prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void insbg(int val){
        node nn = new node(val);
        nn.next = head;
        head = nn;
    }

    public void inen(int val){
        node nn = new node(val);
        node pre = head;

        if (head==null) {
            head = nn;
            return;
        }
        while (pre!=null) {
            pre = pre.next;
        }
        pre.next = nn;
    }

    public void insertat(int val, int pos){
        node nn = new node(val);

        if (pos==1) {
            nn.next = head;
            head = nn;   
        }
        else{
            node prev = head;
            int count = 1;

            while (count<pos-1) {
                prev = prev.next;
                count++;
            }

            node curr = prev.next;
            nn.next = curr;
            prev.next = nn;
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
        if(head==null || head.next==null){
            return head;
        }

        node pre = head;
        node res = null;
        while (pre.next!=null) {
            res = pre;
            pre = pre.next;
        }

        res.next = null;
        return pre;
    }

    public void delat(int pos){
        if (pos==1) {
            head = head.next;
            return;
        }
        else{
            node pre = head;
            int count =1;
            while (count<pos-1) {
                pre = pre.next;
            }
            node curr = pre.next;
            pre.next = curr.next;
        }
    }

    public void print(node head){
        node nn = head;

        while (nn!= null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        revsll dla = new revsll();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        node rev = dla.rev(dla.head);
        dla.print(rev);
    }
}
