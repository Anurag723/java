public class rmloop {
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
            System.out.print(nn.data+"=>");
            nn = nn.next;
        }

        System.out.println("null");
    }

    private void detloop(){
        node fast = head;
        node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast==slow) {
                remove(slow);
                return;
            }
        }
    }

    private void remove(node slow){
        node temp = head;

        while (slow.next != temp.next) {
            temp = temp.next;
            slow = slow.next;
        }

        slow.next = null;
    }

    public static void main(String[] args) {
        rmloop dla = new rmloop();
        dla.head = new node(4);
        node se = new node(5);
        node th = new node(8);
        node fo = new node(10);
        node fi = new node(9);
        node si = new node(6);

        dla.head.next = se;
        se.next = th;
        th.next = fo;
        fo.next = fi;
        fi.next = si;
        si.next = th;

        dla.print();

        dla.detloop();

        dla.print();
    }
}
