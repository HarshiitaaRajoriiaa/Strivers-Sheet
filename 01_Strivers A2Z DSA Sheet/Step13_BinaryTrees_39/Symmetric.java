public class Symmetric {
    // ? https://leetcode.com/problems/symmetric-tree/description/
    public boolean isSymmetric(TreeNode root) {
        if (root == null)
            return true;
        return helper(root.left, root.right);
    }

    private boolean helper(TreeNode left, TreeNode right) {
        // left = root left right
        // right = root right left
        if (left == null || right == null)
            return left == right; // checking if one is then is other is null or not?

        if (right.val != left.val)
            return false;

        return helper(left.left, right.right) && helper(left.right, right.left);

    } 
}
