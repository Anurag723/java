package code.linkedlist;

public class lengthll {
    private ll head;

    private static class ll {
    
        private int data;
        private ll next;

        public ll(int data){
            this.data = data;
            this.next = null;
        }
    }

    public int length(){
        ll current = head;
        int count = 0;

        while (current!=null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public static void main(String[] args) {
        
        lengthll lenll = new lengthll();
        lenll.head = new ll(10);
        ll sec = new ll(12);
        ll third = new ll(14);
        ll fourth = new ll(16);
        ll fifth = new ll(18);

        lenll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = fifth;

        System.out.println(lenll.length());

    }
}
