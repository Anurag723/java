public class sisll {
    private node head;

    private static class node {
    
        private int data;
        private node next;

        public node(int data){

            this.data = data;
            this.next = null;
        }
    }

    public void insbg(int dt){
        node nn = new node(dt);

        nn.next = head;
        head = nn;
    }

    public void insend(int dt){
        node nn = new node(dt);

        if (head==null) {
            head = nn;
            return;
        }

        node curr = head;
        while (curr.next!= null) {
            curr = curr.next;
        }
        curr.next = nn;
    }

    public void insat(int val,int pos){
        node nn = new node(val);
        if (pos==1) {
            nn.next = head;
            head = nn;
        }

        else{
            node prev = head;
            int count = 1;

            while (count<pos-1) {
                prev = prev.next;
                count++;
            }
            node curr = prev.next;
            nn.next = curr;
            prev.next = nn;
        }
    }

    public node delbg(){
        if (head==null || head.next==null) {
            return head;
        }

        node temp = head;
        head.next = head;
        temp.next = null;

        return temp;
    }

    public node delend(){
        if (head==null || head.next== null) {
            return head;
        }

        node curr = head;
        node res = null;
        while (curr.next!=null) {
            res = curr;
            curr = curr.next;
        }
        res.next = null;

        return curr;
    }

    public void delat(int pos){
        if (pos==1) {
            head = head.next;
        }

        else{
            node prev = head;
            int count = 1;
            while (count<pos-1) {
                prev = prev.next;
                count++;
            }

            node curr = prev.next;
            prev.next = curr.next;
        }
    }

    public void search(int val){
        node n = head;
        int count = 1;

        while (n!= null) {
            if (n.data==val) {
                System.out.println("position is "+count);
                return;
            }
            else{
                n = n.next;
                count++;
            }
        }
        System.out.println("Not found");
    }

    public void print(){
        node n = head;

        while (n!=null) {
            System.out.print(n.data+"->");
            n = n.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        sisll dla = new sisll();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        dla.search(12);
        
        dla.print();
    }
}
