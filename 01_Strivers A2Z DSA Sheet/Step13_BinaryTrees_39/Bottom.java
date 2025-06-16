import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Bottom {
    // ?https://www.geeksforgeeks.org/problems/bottom-view-of-binary-tree/1
    static class Pair {
        Node node;
        int line;

        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    public ArrayList<Integer> bottomView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Map<Integer, Integer> map = new TreeMap<>(); // line -> node value
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair curr = q.poll();
            Node node = curr.node;
            int line = curr.line;

            // Update value for each horizontal line (overwrites top with bottom)
            map.put(line, node.data);

            if (node.left != null) {
                q.offer(new Pair(node.left, line - 1));
            }
            if (node.right != null) {
                q.offer(new Pair(node.right, line + 1));
            }
        }

        // Extract values in order of horizontal distance
        for (int val : map.values()) {
            ans.add(val);
        }

        return ans;
    }
}
