package code.linkedlist;

public class delnode {

    private node head;

    public static class node{
        private int data;
        private node next;

        node(int data){
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

    public node deletend(){
        if(head==null || head.next==null){
            return head;
        }

        node prev = null;
        node curr = head;

        while(curr.next!=null){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
        return curr;
    }

    public void deleteNode(node nd) {
        nd.data = nd.next.data;
        nd.next = nd.next.next;
    }

    public void deleteat(int pos){
        if(pos==1){
            head = head.next;
        }

        else{
            node prev = head;
            int count = 1;

            while(count<pos-1){
                prev = prev.next;
                count++;
            }

            prev.next = prev.next.next;
        }
    }

    public void delbyele(int val){
        node curr = head;

        while(curr!=null && curr.next!=null){
            if(curr.data==curr.next.data){
                curr.next = curr.next.next;
            }

            curr = curr.next;
        }
    }

    public void print(node head){
        node curr = head;
        while (curr != null) {
            System.out.print(curr.data+"->");
            curr = curr.next;
        }
        System.out.println("null");
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

            while (count < pos-1) {
                prev = prev.next;
                count++;
            }

            node curr = prev.next;
            prev.next = newnode;
            newnode.next = curr;
        }
    }


    public void insertend(int x){
        node vl = new node(x);

        if (head == null) {
            head = vl;
            return;
        }

        node curr = head;

        while (curr.next!= null) {
            curr = curr.next;
        }
        curr.next = vl;
    }

    public void insertatbg(int x){
        node dt = new node(x);
        dt.next = head;
        head = dt;
    }


    public static void main(String[] args) {
        delnode list = new delnode();
        
        // Inserting values at the beginning
        list.insertatbg(10);
        list.insertatbg(20);
        list.insertatbg(30);
        list.insertatbg(40);
        list.insertatbg(50);
        
        // Print the current list
        System.out.print("Initial List: ");
        list.print(list.head);  // Expected: 50 -> 40 -> 30 -> 20 -> 10 -> null
        
        // Insert at specific position
        list.insertat(25, 3); // Insert 25 at position 3
        System.out.print("After inserting 25 at position 3: ");
        list.print(list.head);  // Expected: 50 -> 40 -> 25 -> 30 -> 20 -> 10 -> null
        
        // Delete from the beginning
        list.deletebeg();  // Should remove 50
        System.out.print("After deleting from beginning: ");
        list.print(list.head);  // Expected: 40 -> 25 -> 30 -> 20 -> 10 -> null
        
        // Delete from the end
        list.deletend();  // Should remove 10
        System.out.print("After deleting from end: ");
        list.print(list.head);  // Expected: 40 -> 25 -> 30 -> 20 -> null
        
        // Delete at a specific position (position 2)
        list.deleteat(2);  // Should remove 25
        System.out.print("After deleting at position 2: ");
        list.print(list.head);  // Expected: 40 -> 30 -> 20 -> null
        
        // Delete by element value (removes all duplicates)
        list.insertend(30);  // Insert another 30 at the end to test delbyele
        System.out.print("Before deleting duplicates: ");
        list.print(list.head);  // Expected: 40 -> 30 -> 20 -> 30 -> null
        
        list.delbyele(30);  // Should remove second occurrence of 30
        System.out.print("After deleting duplicates: ");
        list.print(list.head);  // Expected: 40 -> 30 -> 20 -> null
        
        // Delete a specific node (node with value 30 in this case)
        node targetNode = list.head.next; // The node with value 30
        list.deleteNode(targetNode);  // Should remove the second 30
        System.out.print("After deleting node with value 30: ");
        list.print(list.head);  // Expected: 40 -> 20 -> null
    }
}
