public class CountNode {
    int count=0;
    //!Tc = 0(N)
    //!Sc = 0(H) log(N)
    public int countNodes(TreeNode root) {
        if(root==null) return 0;
        count++;
        if(root.left!=null)countNodes(root.left);
        if(root.right!=null)countNodes(root.right);
        return count;
    }
}
