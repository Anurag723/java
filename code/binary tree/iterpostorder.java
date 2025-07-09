import java.util.*;

public class iterpostorder {

    private node root;

    public static class node{
        private node left;
        private int data;
        private node right;

        public node(int data){
            this.data = data;
        }
    }

    public iterpostorder(){
        this.root = null;
    }

    public void iterative_postOrder(){
        if (root == null) {
            return;
        }

        Stack<node> stack = new Stack<>();
        node current = root;
        node lastVisited = null;

        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                node peekNode = stack.peek();
                if (peekNode.right != null && lastVisited != peekNode.right) {
                    current = peekNode.right;
                } else {
                    System.out.print(peekNode.data + " ");
                    lastVisited = stack.pop();
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
        iterpostorder tree = new iterpostorder();
        tree.createBinaryTree();
        tree.iterative_postOrder();
    }
}
