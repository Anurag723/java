public class maxvalue {

    private node root;

    private static class node{
        private node left;
        private int data;
        private node right;

        public node(int val){
            this.data = val;
        }
    }

    public int maxval(node root){
        if (root==null) {
            return Integer.MIN_VALUE;
        }

        int res = root.data;
        int left = maxval(root.left);
        int right = maxval(root.right);

        if (left>res) {
            res = left;
        }
        if (right>res) {
            res = right;
        }

        return res;
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
        maxvalue tree = new maxvalue();
        tree.createBinaryTree();
        System.out.println(tree.maxval(tree.root));
    }
}
