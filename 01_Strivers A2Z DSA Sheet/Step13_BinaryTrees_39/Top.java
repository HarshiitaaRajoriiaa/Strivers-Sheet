import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.TreeMap;

public class Top {
    static class Pair {
        Node node;
        int line;

        Pair(Node node, int line) {
            this.node = node;
            this.line = line;
        }
    }

    // ?https://www.geeksforgeeks.org/problems/top-view-of-binary-tree/1
    static ArrayList<Integer> topView(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null)
            return ans;

        Map<Integer, Integer> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));

        while (!q.isEmpty()) {
            Pair p = q.poll();
            Node curr = p.node;
            int line = p.line;

            // Only add if this line is not yet added
            if (!map.containsKey(line)) {
                map.put(line, curr.data);
            }

            if (curr.left != null) {
                q.offer(new Pair(curr.left, line - 1));
            }
            if (curr.right != null) {
                q.offer(new Pair(curr.right, line + 1));
            }
        }

        // Collecting values in order of horizontal distance
        for (int val : map.values()) {
            ans.add(val);
        }

        return ans;
    }
}
