package Learn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {

    public static void main(String[] args) {

    }

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> bfs = new ArrayList<>(); // for ans(traversal)
        Queue<Integer> q = new LinkedList<>(); // First-in first-out
        boolean visited[] = new boolean[V]; // staring from 0 (redundancy)

        // as starting from vertex 0
        q.add(0);
        visited[0] = true;

        while (!q.isEmpty()) {
            Integer node = q.poll(); // poll() = pop out the first element of queue and return it
            bfs.add(node);

            for (int curr : adj.get(node)) { // accessing the entire adjacent nodes of current node
                if (visited[curr] == false) {
                    q.add(curr);
                    visited[curr] = true;
                }
            }
        }
        return bfs;

    }
}