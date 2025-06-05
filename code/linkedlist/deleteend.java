package code.linkedlist;


public class deleteend {
    private node head;

    private static class node {
    
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public node deletebeg(){
        if (head==null) {
            return null;
        }

        node temp = head;
        head = head.next;
        temp.next = null;

        return temp;
    }

    public node deleteend(){

        if (head==null || head.next==null) {
            return head;
        }

        node curr = head;
        node prev = null;

        while (curr.next!= null) {
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        return curr;
    }

    public void insertat(int val, int pos){
        node newnode = new node(val);

        if(pos==1){
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
            prev.next = newnode;
            newnode.next = curr;
        }
    }

    public void print(){
        node nn = head;
        while (nn!= null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        deleteend dlte = new deleteend();
        dlte.head = new node(3);
        node sec= new node(5);
        node third = new node(6);

        
        dlte.head.next = sec;
        sec.next = third;

        dlte.insertat(4, 2);
        dlte.deleteend();
        dlte.print();
    }
}
