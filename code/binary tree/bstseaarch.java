import java.util.*;

public class bstseaarch {
    private node root;

    private static class node{
        private node left;
        private int data;
        private node right;

        public node(int val){
            this.data = val;
        }
    }
    public bstseaarch(){
        this.root = null;
    }

    public node insert(node root, int val){
        if (root == null) {
            root = new node(val);
            return root;
        }

        if (val < root.data) {
            insert(root.left, val);
        }

        if (val > root.data) {
            insert(root.right, val);
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

    public node search(node root, int key){
        if (root==null || root.data==key) {
            return root;
        }

        if (key<root.data) {
            return search(root.left, key);
        }

        else{
            return search(root.right, key);
        }
    }

    public static void main(String[] args) {
        bstseaarch tree = new bstseaarch();
        tree.createbst();
        tree.insert(tree.root, 2);
        tree.insert(tree.root,10);
        node res = tree.search(tree.root, 6);
        System.out.println(res.data);
    }
}
