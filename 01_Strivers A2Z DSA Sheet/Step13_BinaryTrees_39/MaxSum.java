public class MaxSum {
    //?https://leetcode.com/problems/binary-tree-maximum-path-sum/description/
    int max=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        //for every node val + max(left) + max(right)
        helper(root);
        return max;
    }

    private int helper(TreeNode root){
        if(root ==null) return 0;
        int l = Math.max(0, helper(root.left)); // leftsum
        int r = Math.max(0 , helper(root.right)); //rightsum
        max = Math.max(max , (root.val + l+r));
        return (root.val+  Math.max(l , r));

    }
}
