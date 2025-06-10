public class rmdp {
    private node head;

    private static class node {
    
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(node head){
        node nn = head;

        while (nn!=null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public void remove(node head){
        node curr = head;

        while (curr.next!=null && curr!=null) {
            if (curr.data==curr.next.data) {
                curr.next=curr.next.next;
            }

            else{
                curr = curr.next;
            }
        }
    }

    public static void main(String[] args) {
        rmdp dla = new rmdp();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);
        node fi = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fi;

        dla.print(dla.head);

        dla.remove(dla.head);

        dla.print(dla.head);
    }
}
