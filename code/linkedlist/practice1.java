public class practice1 {
    private node head;

    private static class node {
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(){
        node nn = head;

        while (nn != null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }

        System.out.println("null");
    }

    public void insbg(int val){
        node nn = new node(val);
        nn.next = head;
        head = nn;
    }

    public void insend(int val){
        node nn = new node(val);
        
        if (head == null) {
            nn.next = head;
        }

        node curr = head;

        while (curr.next!=null) {
            curr = curr.next;
        }

        curr.next = nn;
    }

    public void insat(int val, int pos){
        node nn = new node(val);

        if (pos==1) {
            nn.next = head;
            head = nn;
        }

        node pre = head;
        int count = 1;

        while (count < pos-1) {
            pre = pre.next;
            count++;
        }

        node curr = pre.next;
        nn.next = curr;
        pre.next = nn;
    }

    public node delbg(){
        if (head == null) {
            return null;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node delend(){
        if (head == null || head.next == null) {
            return head;
        }

        node curr = head;
        node pre = null;

        while (curr.next != null) {
            pre = curr;
            curr = curr.next;
        }

        pre.next = null;
        return curr;
    }

    public void delat(int pos){
        
        if (pos == 1) {
            head = head.next;
        }

        node pre = head;
        int count = 1;

        while (count<pos-1) {
            pre = pre.next;
            count++;
        }

        pre.next = pre.next.next;
    }

    public node rev(){

        node curr = head;
        node pre = null;
        node nxt = null;

        while (curr != null) {
            nxt = curr.next;
            curr.next = pre;
            pre = curr;
            curr = nxt;
        }

        return pre;
    }

    public static node mergesorted(node a, node b){
        node dummy = new node(0);
        node tail = dummy;

        while (a != null && b != null) {
            if (a.data <= b.data) {
                tail.next = a;
                a = a.next;
            }
            else{
                tail.next = b;
                b = b.next;
            }
            tail = tail.next;
        }

        if (a==null) {
            tail.next = b;
        }
        
        else{
            tail.next = a;
        }

        return dummy.next;
    }

    public static node sum(node a, node b){
        node dummy = new node(0);
        node tail = dummy;
        int carry = 0;

        while (a != null || b != null) {
            int x = (a!=null)?a.data:0;
            int y = (b!=null)?b.data:0;
            int sum = x+y+carry;

            carry = sum/10;

            tail.next = new node(sum%10);
            tail = tail.next;

            if (a != null) {
                a = a.next;
            }

            if (b != null) {
                b = b.next;
            }
        }

        if (carry>0) {
            tail.next = new node(carry);
        }

        return dummy.next;
    }

    public boolean detloop(){
        node fast = head;
        node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast==slow) {
                return true;
            }
        }
        return false;
    }

    public void rmloop(){
        node fast = head;
        node slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                remove(slow);
                return;
            }
        }
    }

    public void remove(node slow){
        node temp = head;

        while (slow.next != temp.next) {
            temp = temp.next;
            slow = slow.next;
        }

        slow.next = null;
    }

    public static void main(String[] args) {
        practice1 dla1 = new practice1();
        dla1.head = new node(2);
        node sec = new node(4);
        node thi = new node(6);
        node fou = new node(8);

        practice1 dla2 = new practice1();
        dla2.head = new node(3);
        node se = new node(5);
        node th = new node(7);

        dla1.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        dla2.head.next = se;
        se.next = th;

        practice1 res = new practice1();
        res.head = mergesorted(dla1.head, dla2.head);

        res.print();
    }
}
