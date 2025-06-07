public class Diameter {
    int max = 0;

    // ? https://leetcode.com/problems/diameter-of-binary-tree/
    // todo : The diameter of a binary tree is the length of the longest path
    // between any two nodes in a tree. This path may or may not pass through the
    // root.
    public static void main(String[] args) {

    }

    public int diameterOfBinaryTree(TreeNode root) {
        // for every node maximum sum(left tree height and right tree height is the ans)
        heightSum(root);
        return max;

    }

    public int heightSum(TreeNode root) {
        if (root == null)
            return 0;
        int l = heightSum(root.left);
        int r = heightSum(root.right);
        max = Math.max(max, (l + r));
        return 1 + Math.max(l, r);
    }
}
