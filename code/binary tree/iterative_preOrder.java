import java.util.*;

public class iterative_preOrder {
    private node root;
    private static class node{
        private node left;
        private node right;
        private int data;

        public node(int val){
            this.data = val;
        }
    }

    public iterative_preOrder(){
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

    public void preorder(node root){
        if (root==null) {
            return;
        }
        Stack<node> stc = new Stack<>();
        stc.push(root);

        while (!stc.isEmpty()) {
            node temp = stc.pop();
            System.out.print(temp.data+" ");

            if(temp.right!=null){
                stc.push(temp.right);
            }

            if (temp.left!=null) {
                stc.push(temp.left);
            }
        }
    }

    public static void main(String[] args) {
        iterative_preOrder tree = new iterative_preOrder();
        tree.createBinaryTree();
        tree.preorder(tree.root);
    }
}
