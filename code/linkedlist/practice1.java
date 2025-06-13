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

}
