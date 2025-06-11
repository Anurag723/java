public class detloop{
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
            System.out.println(nn.data+"->");
            nn = nn.next;
        }

        System.out.println("null");
    }

    public boolean detect(){
        node first = head;
        node sec = head;

        while (first != null && first.next != null) {
            first = first.next.next;
            sec = sec.next;

            if (first==sec) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        detloop dla = new detloop();
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

        System.out.println(dla.detect());
    }
}