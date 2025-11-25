import java.util.HashMap;
import java.util.Map;

public class Order {

    // ---------- TreeNode Definition ----------
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int x) {
            val = x;
        }
    }

    // ---------- Solution Class ----------
    static class Solution {
        private int preIndex = 0;
        private Map<Integer, Integer> inorderIndexMap;

        public TreeNode buildTree(int[] preorder, int[] inorder) {
            inorderIndexMap = new HashMap<>();

            for (int i = 0; i < inorder.length; i++) {
                inorderIndexMap.put(inorder[i], i);
            }

            return build(preorder, 0, inorder.length - 1);
        }

        private TreeNode build(int[] preorder, int left, int right) {
            if (left > right) return null;

            int rootVal = preorder[preIndex++];
            TreeNode root = new TreeNode(rootVal);

            int mid = inorderIndexMap.get(rootVal);

            root.left = build(preorder, left, mid - 1);
            root.right = build(preorder, mid + 1, right);

            return root;
        }
    }

    // ---------- Helper: Print Tree (Inorder) ----------
    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    // ---------- Main Method ----------
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};

        TreeNode root = sol.buildTree(preorder, inorder);

        System.out.println("Inorder of constructed tree:");
        printInorder(root);
    }
}
