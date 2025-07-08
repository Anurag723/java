import java.util.*;
public class iterativeinorder {
    private node root;

    private static class node{
        private node left;
        private node right;
        private int data;

        public node(int val){
            this.data = val;
        }
    }

    public iterativeinorder(){
        this.root = null;

    }

    public void recinorder(node inord){
        if (inord==null) {
            return;
        }
        recinorder(inord.left);
        System.out.print(inord.data+" ");
        recinorder(inord.right);
    }

    public void iterinorder(node root){
        if (root == null) {
            return;
        }

        Stack<node> stc = new Stack<>();
        node temp = root;

        while (!stc.isEmpty() || temp!=null) {
            if (temp!=null) {
                stc.push(temp);
                temp = temp.left;
            }
            else{
                temp = stc.pop();
                System.out.print(temp.data+" ");
                temp = temp.right;
            }
        }
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
        iterativeinorder tree = new iterativeinorder();
        tree.createBinaryTree();
        tree.recinorder(tree.root);
        System.out.println();
        tree.iterinorder(tree.root);
    }
}
