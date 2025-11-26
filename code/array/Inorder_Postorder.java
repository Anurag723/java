import java.util.*;

public class Inorder_Postorder {

    // TreeNode definition
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
        }
    }

    // === Build Tree from Inorder + Postorder ===
    static class Solution {
        private Map<Integer, Integer> indexMap;
        private int postIndex;

        public TreeNode buildTree(int[] inorder, int[] postorder) {
            indexMap = new HashMap<>();
            for (int i = 0; i < inorder.length; i++) {
                indexMap.put(inorder[i], i);
            }

            postIndex = postorder.length - 1;
            return build(inorder, postorder, 0, inorder.length - 1);
        }

        private TreeNode build(int[] inorder, int[] postorder, int left, int right) {
            if (left > right) return null;

            int rootVal = postorder[postIndex--];
            TreeNode root = new TreeNode(rootVal);

            int mid = indexMap.get(rootVal);

            // Build right subtree first
            root.right = build(inorder, postorder, mid + 1, right);
            root.left = build(inorder, postorder, left, mid - 1);

            return root;
        }
    }

    // === Helper: Print tree in Preorder ===
    public static void printPreorder(TreeNode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    // === Main ===
    public static void main(String[] args) {
        int[] inorder =  {9, 3, 15, 20, 7};
        int[] postorder = {9, 15, 7, 20, 3};

        Solution sol = new Solution();
        TreeNode root = sol.buildTree(inorder, postorder);

        System.out.print("Preorder of constructed tree: ");
        printPreorder(root);
    }
}
