import java.util.ArrayList;
import java.util.Stack;

public class Boundary {
    // ? https://www.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1

    ArrayList<Integer> boundaryTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        if (!isLeaf(root))
            ans.add(root.data);

        leftBoundary(root, ans);
        leafNodes(root, ans);
        rightBoundary(root, ans);

        return ans;
    }

    // Left boundary (excluding leaves)
    private void leftBoundary(Node root, ArrayList<Integer> ans) {
        Node curr = root.left;
        while (curr != null) {
            if (!isLeaf(curr))
                ans.add(curr.data);
            if (curr.left != null)
                curr = curr.left;
            else
                curr = curr.right;
        }
    }

    // Leaf nodes (in-order traversal)
    private void leafNodes(Node root, ArrayList<Integer> ans) {
        if (root == null)
            return;
        if (isLeaf(root)) {
            ans.add(root.data);
            return;
        }
        leafNodes(root.left, ans);
        leafNodes(root.right, ans);
    }

    private void rightBoundary(Node root, ArrayList<Integer> ans) {
        Node curr = root.right;
        Stack<Integer> stack = new Stack<>();
        while (curr != null) {
            if (!isLeaf(curr))
                stack.push(curr.data);
            if (curr.right != null)
                curr = curr.right;
            else
                curr = curr.left;
        }
        while (!stack.isEmpty()) {
            ans.add(stack.pop());
        }
    }

    // Helper to check if a node is a leaf
    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }
}
