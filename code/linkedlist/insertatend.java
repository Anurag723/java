public class insertatend {
    private ll head;

    private static class ll{
        private int data;
        private ll next;

        private ll(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void print(){
        ll current  = head;

        while (current!=null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }

        System.out.println("null");
    }

    public void insertend(int x){
        ll vl = new ll(x);

        if (head == null) {
            head = vl;
            return;
        }

        ll curr = head;

        while (curr.next!= null) {
            curr = curr.next;
        }
        curr.next = vl;
    }

    public void insertat(int val, int pos){
        ll nn = new ll(val);
        
        if (pos==0) {
            nn.next = head;
            head = nn;
        }

        else{
            ll prev = head;
            int count = 1;

            while (count<pos-1) {
                prev = prev.next;
                count++;
            }

            ll curr = prev.next;
            nn.next = curr;
            prev.next = nn;
        }
    }

    public static void main(String[] args) {
        insertatend ibl = new insertatend();
        ibl.head = new ll(10);
        ll second = new ll(12);
        ll third = new ll(14);

        ibl.head.next = second;
        second.next = third;

        ibl.insertend(8);
        ibl.insertat(20, 5);
        ibl.print();
    }
}
