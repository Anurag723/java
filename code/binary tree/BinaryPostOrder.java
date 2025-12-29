import java.util.*;

public class BinaryPostOrder {

    // Tree node definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            left = right = null;
        }
    }

    // Recursive postorder traversal
    public static void postorder(TreeNode root, List<Integer> res) {
        if (root == null) return;

        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }

    // Driver code
    public static void main(String[] args) {

        // Constructing the tree
        //     1
        //      \
        //       2
        //      /
        //     3

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        List<Integer> result = new ArrayList<>();
        postorder(root, result);

        System.out.println("Postorder Traversal: " + result);
    }
}
