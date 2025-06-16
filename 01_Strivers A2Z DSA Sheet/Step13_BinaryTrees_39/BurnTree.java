import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class BurnTree {
    //?https://www.geeksforgeeks.org/problems/burning-tree/1
    public static int minTime(Node root, int target) {
        Map<Node, Node> parent = new HashMap<>();
        Node targetNode = buildParentMapAndFindTarget(root, parent, target);

        Map<Node, Boolean> visited = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(targetNode);
        visited.put(targetNode, true);
        
        int time = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            boolean burned = false;
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                // burn left
                if (curr.left != null && visited.get(curr.left) == null) {
                    visited.put(curr.left, true);
                    q.offer(curr.left);
                    burned = true;
                }
                // burn right
                if (curr.right != null && visited.get(curr.right) == null) {
                    visited.put(curr.right, true);
                    q.offer(curr.right);
                    burned = true;
                }
                // burn parent
                Node par = parent.get(curr);
                if (par != null && visited.get(par) == null) {
                    visited.put(par, true);
                    q.offer(par);
                    burned = true;
                }
            }
            if (burned) time++;
        }
        return time;
    }

    // Helper to build parent map and return the node with target value
    private static Node buildParentMapAndFindTarget(Node root, Map<Node, Node> parent, int target) {
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        Node targetNode = null;

        while (!q.isEmpty()) {
            Node curr = q.poll();
            if (curr.data == target) {
                targetNode = curr;
            }
            if (curr.left != null) {
                parent.put(curr.left, curr);
                q.offer(curr.left);
            }
            if (curr.right != null) {
                parent.put(curr.right, curr);
                q.offer(curr.right);
            }
        }
        return targetNode;
    }

}
