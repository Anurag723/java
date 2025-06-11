public class startofloop{
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

    public node detloop(){

        node fast = head;
        node slow = head;

        while (fast!=null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow){
                return getloop(slow);
            }
        }

        return null;
    }
    
    public node getloop(node sl){
        node temp = head;

        while (temp!=sl) {
            temp = temp.next;
            sl = sl.next;
        }

        return temp;
    }

    public static void main(String[] args) {
        startofloop dla = new startofloop();
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

        node res = dla.detloop();
        System.out.println(res.data);
    }
}