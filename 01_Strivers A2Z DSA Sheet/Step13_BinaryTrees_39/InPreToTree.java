import java.util.*;
//? https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
public class InPreToTree {
    public Node buildTree(Vector<Integer> pre_order, Vector<Integer> in_order) {
        // Create a map to store indices
        // of elements in the in_order traversal
        Map<Integer, Integer> inMap = new HashMap<>();

        // Populate the map with indices
        // of elements in the in_order traversal
        for (int i = 0; i < in_order.size(); i++) {
            inMap.put(in_order.get(i), i);
        }

        // Call the private helper function
        // to recursively build the tree
        Node root = buildTree(pre_order, 0, pre_order.size() - 1, in_order, 0, in_order.size() - 1, inMap);
        return root;
    }

    // Recursive helper function to build the tree
    private Node buildTree(Vector<Integer> pre_order, int preStart, int preEnd, Vector<Integer> in_order, int inStart, int inEnd, Map<Integer, Integer> inMap) {
        // Base case: If the start indices
        // exceed the end indices, return null
        if (preStart > preEnd || inStart > inEnd) return null;
        // Create a new Node with data
        // at the current pre_order index
        Node root = new Node(pre_order.get(preStart));

        // Find the index of the current root  data in the in_order traversal
        int inRoot = inMap.get(root.data); // place of root in inorder traversal 

        // Calculate the number of elements in the left subtree
        int numsLeft = inRoot - inStart;

        // Recursively build the left subtree
        root.left = buildTree(pre_order, preStart + 1, preStart + numsLeft,
                in_order, inStart, inRoot - 1, inMap);

        // Recursively build the right subtree
        root.right = buildTree(pre_order, preStart + numsLeft + 1, preEnd,
                in_order, inRoot + 1, inEnd, inMap);

        // Return the current root node
        return root;
    }

}