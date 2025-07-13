import java.util.LinkedList;
import java.util.Queue;

public class validatebst {
    private node root;

    private static class node{
        private node left;
        private int data;
        private node right;

        public node(int val){
            this.data = val;
        }
    }

    public validatebst(){
        this.root = null;
    }

    public node insert(node root, int val){
        if(root == null){
            root = new node(val);
            return root;
        }

        if (root.data>val) {
            root.left = insert(root.left, val);
        }
    
        if (root.data<val) {
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

    public boolean validate(node root, int min, int max){
        if (root == null) {
            return true;
        }

        if (root.data <= min || root.data >= max) {
            return false;
        }

        boolean left = validate(root.left, min, root.data);
        if(left){
            boolean right = validate(root.right, root.data, max);
            return right;
        }
        return false;
    }

    public static void main(String[] args) {
        validatebst tree = new validatebst();
        tree.createbst();
        tree.insert(tree.root, 2);
        tree.insert(tree.root,10);
        tree.traversal();

        System.out.println(tree.validate(tree.root,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
