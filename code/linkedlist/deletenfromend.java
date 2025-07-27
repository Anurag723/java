package code.linkedlist;

public class deletenfromend {
    
    private node head;

    private static class node{
        private int data;
        private node next;

        public node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public node deletebeg(){
        if(head==null || head.next==null){
            return head;
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

    public node removeNthFromEnd(node head, int n) {
        node dumy = new node(0);
        dumy.next = head;

        node fast = dumy;
        node slow = dumy;

        for(int i= 0; i<n+1; i++){
            fast = fast.next;
        }

        while (fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;

        return dumy.next;
    }

    public static void main(String[] args) {
        deletenfromend list = new deletenfromend();

        // Insert some nodes into the list
        list.insertat(1, 1);
        list.insertat(2, 2);
        list.insertat(3, 3);
        list.insertat(4, 4);
        list.insertat(5, 5);

        System.out.println("Original List:");
        list.print();

        // Remove the 2nd node from the end
        int n = 2;
        // Update head after removal
        list.head = list.removeNthFromEnd(list.head, n);

        System.out.println("List after removing " + n + "th node from end:");
        list.print();
    }
}
