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

        while (first.next!=null) {
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
        dla.print(dla.head);
        System.out.println(rev);
    }
}