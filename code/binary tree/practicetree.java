import java.util.*;

public class practicetree {
    
    private node root;

    public static class node{
        private node left;
        private int data;
        private node right;

        public node(int val){
            this.data = val;
        }
    }

    public practicetree(){
        this.root = null;
    }

    public void preorder(node root){
        if (root == null) {
            return;
        }

        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public void iter_pre(){
        if (root == null) {
            return;
        }

        Stack<node> stc = new Stack<>();
        stc.push(root);

        while (!stc.isEmpty()) {
            node temp = stc.pop();
            System.out.print(temp.data+" ");

            if (temp.right!=null) {
                stc.push(temp.right);
            }

            if (temp.left!=null) {
                stc.push(temp.left);
            }
        }
    }

    public void recinorder(node root){
        if(root == null)
            return;

        recinorder(root.left);
        System.out.print(root.data + " ");
        recinorder(root.right);
    }

    public void iter_inorder(){
        if (root == null) {
            return;
        }

        Stack<node> stc = new Stack<>();
        node curr = root;

        while (!stc.isEmpty() || curr != null) {
            if (curr != null) {
                stc.push(curr);
                curr = curr.left;
            }

            else{
                curr = stc.pop();
                System.out.print(curr.data+" ");
                curr = curr.right;
            }
        }
    }

    public void recpost(node root){
        if (root == null) {
            return;
        }

        recpost(root.left);
        recpost(root.right);
        System.out.print(root.data+" ");
    }

    public void iter_post(){
        if (root == null) {
            return;
        }

        Stack<node> stc = new Stack<>();
        node curr = root;
        node temp = null;
        
        while (!stc.isEmpty() || curr != null) {
            if (curr != null) {
                stc.push(curr);
                curr = curr.left;
            }

            else{
                temp = stc.peek().right;
                if (temp == null) {
                    temp = stc.pop();
                    System.out.print(temp.data + " ");

                    while (!stc.isEmpty() && temp == stc.peek().right) {
                        temp = stc.pop();
                        System.out.print(temp.data+" ");
                    }
                }
                else{
                    curr = temp;
                }
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
        practicetree tree = new practicetree();
        tree.createBinaryTree();
        tree.preorder(tree.root);
        System.out.println();
        tree.iter_pre();
        System.out.println();
        tree.recinorder(tree.root);
        System.out.println();
        tree.iter_inorder();
        System.out.println();
        tree.recpost(tree.root);
        System.out.println();
        tree.iter_post();
    }
}