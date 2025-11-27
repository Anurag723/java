class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ArrToTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    public TreeNode build(int[] nums, int left, int right) {
        if (left > right) return null;

        int mid = left + (right - left) / 2;
        TreeNode res = new TreeNode(nums[mid]);

        res.left = build(nums, left, mid - 1);
        res.right = build(nums, mid + 1, right);

        return res;
    }

    // Helper: print tree in-order (should match sorted array)
    public void printInOrder(TreeNode root) {
        if (root == null) return;
        printInOrder(root.left);
        System.out.print(root.val + " ");
        printInOrder(root.right);
    }

    public static void main(String[] args) {
        ArrToTree converter = new ArrToTree();
        
        int[] nums = {-10, -3, 0, 5, 9};
        TreeNode root = converter.sortedArrayToBST(nums);

        System.out.println("In-order traversal of BST:");
        converter.printInOrder(root);
    }
}
