public class addtwosortll {

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

        while (nn != null) {
            System.out.print(nn.data+"->");
            nn = nn.next;
        }
        System.out.println("null");
    }

    public node findsum(node a, node b){
        node dummy = new node(0);
        node tail = dummy;

        int carry = 0;

        while (a != null || b != null) {
            int x = (a!=null)? a.data:0;
            int y = (b!=null)? b.data:0;

            int sum = carry + x + y;
            carry = (int)(sum/10);
            tail.next = new node(sum % 10);

            tail = tail.next;

            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }

        if (carry > 0) {
            tail.next = new node(carry);
        }

        return dummy.next;
    }

    public static void main(String[] args) {
        
    }
}
