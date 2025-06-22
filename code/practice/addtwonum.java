public class addtwonum {
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static node sumnode(node ll1, node ll2){
        node dummy = new node(0);
        node tail = dummy;

        int carry = 0;
        while (ll1 != null || ll2 != null) {
            int x = (ll1!=null) ?(ll1.data):0;
            int y = (ll2!=null) ?(ll2.data):0;

            int sum = x+y+carry;
            int digit = sum%10;
            carry = sum/10;

            tail.next = new node(digit);
            tail = tail.next;

            if(ll1 != null) ll1 = ll1.next;
            if(ll2 != null) ll2 = ll2.next;
        }
        if(carry>0) tail.next = new node(carry);

        return dummy.next;
    }


    public void print(){
        node nn = head;

        while (nn != null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        addtwonum ll1 = new addtwonum();
        ll1.head = new node(2);
        node sec = new node(4);
        node thi = new node(6);
        node fou = new node(8);

        ll1.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        ll1.print();


        addtwonum ll2 = new addtwonum();
        ll2.head = new node(1);
        node sc = new node(3);
        node th = new node(5);
        node fo = new node(7);

        ll2.head.next = sc;
        sc.next = th;
        th.next = fo;

        ll2.print();

        addtwonum res = new addtwonum();
        res.head = sumnode(ll1.head, ll2.head);

        res.print();

    }
}