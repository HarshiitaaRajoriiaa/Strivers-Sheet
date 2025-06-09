public class RootSum {
    public boolean checkTree(TreeNode root) {
        int root_data = root.val;
        if (root.left.val + root.right.val != root_data)
            return false;
        return true;
    }

    // todo make it follow children sum property by increment the value of nodes and
    // not subtract
    public void childrenSumProperty(Node root){
        if(root==null) return;
        int child = 0;
        if(root.left != null) child+=root.left.data;
        if(root.right != null) child+= root.right.data;
        if(child < root.data) {
            if(root.left != null) root.left.data = root.data;
            if(root.right != null) root.right.data = root.data;
        }
        else root.data = child;

        childrenSumProperty(root.left);
        childrenSumProperty(root.right);
        int tot=0;
        if(root.right != null) tot+=root.right.data;
        if(root.left != null) tot+= root.left.data;
        if(root.left != null || root.right != null) root.data = tot;
    }
}
