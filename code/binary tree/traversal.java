public class traversal {
    private node root;

    private static class node{
        private node left;
        private node right;
        private int data;

        public node(int data){
            this.data = data;
        }
    }

    public traversal(){
        this.root = null;
    }

    public void createTree(){
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


    // preOrder recursi
    public void preOrder(node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        traversal tree = new traversal();
        tree.createTree();
        tree.preOrder(tree.root);
    }
}