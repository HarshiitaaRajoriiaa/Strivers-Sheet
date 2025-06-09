import java.util.*;

public class LowCommAns {
    // ?
    // https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/submissions/1658280575/

    public static Node lCM(Node root, Node p, Node q) {
        if (root == null || root == p || root == q)
            return root;
        Node left = lCM(root.left, p, q);
        Node right = lCM(root.right, p, q);

        // * null+null - null , null +x , x+ null - x , x + y - root value
        if (left == null)
            return right;
        else if (right == null) {
            return left;
        } else
            return root;
    }
}