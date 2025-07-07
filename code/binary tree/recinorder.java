public class recinorder{
    private node root;

    private static class node{
        private int data;
        private node left;
        private node right;

        public node(int val){
            this.data = val;
        }
    }

    public recinorder(){
        this.root = null;
    }

    public void createBinaryTree(){
        node first = new node(12);
        node second = new node(14);
        node third = new node(16);
        node fourth = new node(18);
        node fifth = new node(20);
        node sixth = new node(22);
        node seventh = new node(24);

        root = first;

        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        third.right = seventh;
    }

    public void recin(node root){
        if (root==null) {
            return;
        }

        recin(root.left);
        System.out.print(root.data+" ");
        recin(root.right);
    }

    public static void main(String[] args) {
        recinorder tree = new recinorder();
        tree.createBinaryTree();
        tree.recin(tree.root);
    }
}