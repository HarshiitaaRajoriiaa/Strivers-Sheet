import java.util.*;
//?https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
public class NodeAtKDts {
    public List<Integer> distanceK(Node root, Node target, int k) {
        //draw pointers to evry parent node to backtrack 
        Map<Node, Node> parent = new HashMap<>();
        pointer(root, parent);
        Map<Node, Boolean> visted = new HashMap<>();
        Queue<Node> q = new LinkedList<>();
        q.offer(target);
        visted.put(target , true);
        int dis = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            if (dis == k)
                break;
            dis++;
            for (int i = 0; i < size; i++) {
                Node curr = q.poll();
                if (curr.left != null && visted.get(curr.left) == null) {
                    q.offer(curr.left);
                    visted.put(curr.left, true);
                }
                if (curr.right != null && visted.get(curr.right) == null) {
                    q.offer(curr.right);
                    visted.put(curr.right, true);
                }
                if (parent.get(curr) != null && visted.get(parent.get(curr)) == null) {
                    q.offer(parent.get(curr));
                    visted.put(parent.get(curr), true);
                }
            }

        }
        List<Integer> ans = new ArrayList<>();
        while (!q.isEmpty()) {
            ans.add(q.poll().data);
        }
        return ans;
    }

    //we have made a map which store node , parent 
    public void pointer(Node root, Map<Node, Node> parent) {

        if (root == null)
            return;
        if (root.left != null)
            parent.put(root.left, root);
        if (root.right != null)
            parent.put(root.right, root);
        pointer(root.left, parent);
        pointer(root.right, parent);
    }
}
