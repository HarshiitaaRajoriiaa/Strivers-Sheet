public class MaxHeight {
    public static void main(String[] args) {

    }

    // ? https://leetcode.com/problems/maximum-depth-of-binary-tree/
    public int maxDepth(TreeNode root) {
        // recursive == skewed tree
        // iterative == complete binary tree
        // for root = 1+ maxHeight(left tree , right tree) , recursive calls for every
        // node and check for their tree and finally got up to the root to get the
        // maximum height , tc = 0(N)
        if (root == null)
            return 0;
        int l = maxDepth(root.left);
        int r = maxDepth(root.right);
        return 1 + Math.max(l, r);
    }

    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     * int val;
     * TreeNode left;
     * TreeNode right;
     * TreeNode() {}
     * TreeNode(int val) { this.val = val; }
     * TreeNode(int val, TreeNode left, TreeNode right) {
     * this.val = val;
     * this.left = left;
     * this.right = right;
     * }
     * }
     */
    class Solution {
        public boolean isBalanced(TreeNode root) {
            return height(root) != -1;

        }

        // -1 = false , 0 = true
        // For every node, the absolute difference between the heights of its left and
        // right subtrees is not more than 1.
        private int height(TreeNode node) {
            if (node == null)
                return 0;
            int l = height(node.left);
            if (l == -1)
                return -1;
            int r = height(node.right);
            if (r == -1)
                return -1;
            if (Math.abs(l - r) > 1)
                return -1;
            return 1 + Math.max(l, r);
        }

        // Function isBalanced(root):
        // Return (height(root) != -1)

        // Function height(node):
        // If node is null:Return 0 // Height of empty tree

        // leftHeight=

        // height(node.left)
        // If leftHeight == -1:
        // Return -1 // Left subtree is unbalanced

        // rightHeight = height(node.right)
        // If rightHeight == -1:
        // Return -1 // Right subtree is unbalanced

        // If abs(leftHeight - rightHeight) > 1:
        // Return -1 // Current node is unbalanced

        // Return 1 + max(leftHeight, rightHeight) // Height if balanced

    }
}
