public class deleteel {
    private node head;

    public static class node {
    
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void delel(int val){
        node curr = head;
        
        while (curr!=null && curr.next!=null) {
            if (curr.next.data == val) {
                curr.next = curr.next.next;
                
            }
            curr = curr.next;
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

    public static void main(String[] args) {
        deleteel dla = new deleteel();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);
        node fi = new node(20);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;
        fou.next = fi;

        dla.delel(14);
        dla.print(dla.head);
    }
}
