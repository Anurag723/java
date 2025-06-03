class insertbeg{
    private ll head;

    private static class ll{
        private int data;
        private ll next;

        private ll(int data){
            this.data = data;
            this.next = null;
        }
    }

    public void printll(){
        ll current = head;
        while (current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void insertatbg(int x){
        ll dt = new ll(x);
        dt.next = head;
        head = dt;
    }

    public static void main(String[] args) {
        insertbeg ibl = new insertbeg();
        ibl.head = new ll(10);
        ll second = new ll(12);
        ll third = new ll(14);

        ibl.head.next = second;
        second.next = third;

        ibl.insertatbg(8);
        ibl.printll();
    }
}