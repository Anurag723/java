class nthfromend{
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;

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

    public node nth(int pos){

        if (head==null) {
            return head;
        }

        node mp = head;
        node rp = head;

        int count = 0;

        while(count<pos){
            rp = rp.next;
            count++;
        }

        while (rp!=null) {
            rp = rp.next;
            mp = mp.next;
        }

        return mp;
    }

    public static void main(String[] args) {
        nthfromend dla = new nthfromend();

        dla.head = new node(10);
        node sec = new node(8);
        node tr = new node(1);
        node fo = new node(11);
        node fi = new node(15);

        dla.head.next = sec;
        sec.next = tr;
        tr.next = fo;
        fo.next = fi;

        node res = dla.nth(2);
        System.out.println(res.data);
    }
}