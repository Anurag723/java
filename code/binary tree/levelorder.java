import java.util.*;

class levelorder{
    private node root;

    private static class node{
        private node left;
        private int data;
        private node right;

        public node(int val){
            this.data = val;
        }
    }

    public levelorder(){
        this.root = null;
    }

    public void leveltrav(){
        if (root == null) {
            return;
        }

        Queue<node> que = new LinkedList<>();
        que.offer(root);

        while (!que.isEmpty()) {
            node temp = que.poll();
            System.out.print(temp.data+" ");

            if (temp.left != null) {
                que.offer(temp.left);
            }

            if (temp.right != null) {
                que.offer(temp.right);
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
        levelorder tree = new levelorder();
        tree.createBinaryTree();
        tree.leveltrav();
    }
}