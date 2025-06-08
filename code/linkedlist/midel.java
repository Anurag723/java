class midel{
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int val){
            this.data = val;
            this.next = null;
        }
    }

    public void insertbg(int val){
        node nn = new node(val);
        nn.next = head;
        head = nn;
    }

    public void insertend(int val){
        node nn = new node(val);
        node curr = head;
        while (curr!= null) {
            curr = curr.next;
        }

        curr.next = nn;
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
            }

            node curr = prev.next;
            nn.next = curr;
            prev.next = nn;
        }
    }

    public node deletebg(){
        if (head==null || head.next==null) {
            return head;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }
    public node deleteen(){
        if (head== null|| head.next==null) {
            return head;
        }

        node pt = head;
        node cu = null;

        while (pt.next!=null) {
            cu = pt;
            pt = pt.next;
        }

       
        cu.next = null;
        return pt;
    }


    public void print(node head){
        node curr = head;

        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public int mid(node head){
        node sec = head;
        node first = head;

        while (first != null && first.next!=null) {
            sec = sec.next;
            first = first.next.next;
        }
        return sec.data;
    }

    public static void main(String[] args) {
        midel dla = new midel();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);
        node fi = new node(20);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fi;

        int rev = dla.mid(dla.head);
        dla.deleteen();
        dla.print(dla.head);
        System.out.println(rev);
    }
}