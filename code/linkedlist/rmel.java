public class rmel {
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

    public void remel(int val){
        if (head==null) {
            System.out.println("empty ll");
            return;
        }

        node curr = head;
        while (curr.next!= null && curr!=null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
                System.out.println("removed");
                return;
            }

            curr = curr.next;
        }
        System.out.println("Ele not found");
    }

    public static void main(String[] args) {
        rmel dla = new rmel();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        dla.print();

        dla.remel(14);

        dla.print();
    }
}
