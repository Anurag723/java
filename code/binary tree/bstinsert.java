import java.util.*;

public class bstinsert {
    private node root;
    
    private static class node{
        private node left;
        private int data;
        private node right;

        public node(int data){
            this.data = data;
        }
    }

    public bstinsert(){
        this.root = null;
    }

    public node insert(node root, int val){
        if (root==null) {
            root = new node(val);
            return root;
        }

        if (val < root.data) {
            root.left = insert(root.left, val);
        }

        if (val > root.data) {
            root.right = insert(root.right, val);
        }
        return root;
    }

    public void createbst(){
        node first = new node(6);
        node sec = new node(4);
        node three = new node(8);
        node fourth = new node(3);
        node fifth = new node(5);
        node sixth = new node(7);
        node seventh = new node(9);

        root = first;

        first.left = sec;
        first.right = three;

        sec.left = fourth;
        sec.right = fifth;

        three.left = sixth;
        three.right = seventh;
    }

    public void traversal(){
        if (root == null) {
            return;
        }

        Queue<node> que = new LinkedList<>();
        que.offer(root);

        while(!que.isEmpty()){
            node temp = que.poll();
            System.out.print(temp.data+" ");

            if (temp.left!=null) {
                que.offer(temp.left);
            }
            if (temp.right!=null) {
                que.offer(temp.right);
            }
        }
    }

    public static void main(String[] args) {
        bstinsert tree = new bstinsert();
        tree.createbst();
        tree.insert(tree.root, 2);
        tree.insert(tree.root,10);
        tree.traversal();
    }
}
