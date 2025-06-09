class deleteat{
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
        node curr = head;

        while(curr!=null){
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void insertbeg(int data){
        node nn = new node(data);
        nn.next = head;
        head = nn;
    }

    public void insertend(int data){

        node nn = new node(data);
        node curr = head;

        if (head==null) {
            head = nn;
            return;
        }

        while (curr.next!=null) {
            curr = curr.next;
        }

        curr.next = nn;
    }

    public void insertat(int val, int pos){
        node newnode = new node(val);

        if (pos==1) {
            newnode.next = head;
            head = newnode;
        }

        else{
            node prev = head;
            int count = 1;

            while (count<pos-1) {
                prev = prev.next;
                count++;
            }

            node curr = prev.next;
            newnode.next = curr;
            prev.next = newnode;
        }
    }

    public node delbeg(){
        if (head==null || head.next==null) {
            return head;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node delend(){
        if (head == null || head.next==null) {
            return head;
        }

        node prev = null;
        node curr = head;

        while (curr.next!=null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        return curr;
    }

    public void delat(int pos){
        if(pos==1){
            head = head.next;
        }

        else{
            node prev = head;
            int count = 1;

            while (count<pos-1) {
                prev = prev.next;
                count++;
            }
            // node curr = prev.next;
            // prev.next = curr.next;

            prev.next = prev.next.next;
        }
    }

    public static void main(String[] args) {
        deleteat dla = new deleteat();
        dla.head = new node(12);
        node sec = new node(14);
        node thi = new node(16);
        node fou = new node(18);

        dla.head.next = sec;
        sec.next = thi;
        thi.next = fou;

        dla.print();
    }
}