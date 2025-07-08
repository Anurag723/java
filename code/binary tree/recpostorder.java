public class recpostorder {

    private node root;

    private static class node{
        private int data;
        private node left;
        private node right;

        public node(int data){
            this.data = data;
        }
    }
    public recpostorder(){
        this.root = null;
    }

    public void postorder(node root){
        if (root == null) {
            return;
        }

        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
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
    public static void main(String[] args) {
        recpostorder tree = new recpostorder();
        tree.createBinaryTree();
        tree.postorder(tree.root);
    }
}
