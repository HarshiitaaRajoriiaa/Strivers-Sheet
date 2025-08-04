import java.util.ArrayList;
import java.util.List;
//?https://leetcode.com/problems/permutation-sequence/
public class KPermutations {
    public String getPermutation(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean[] map = new boolean[n];
        permutations(n, curr, ans, map);

        List<Integer> a = ans.get(k - 1);   
        StringBuilder a1 = new StringBuilder(); 
        for (int i = 0; i < a.size(); i++) {
            a1.append(a.get(i));
        }    
        return a1.toString();
    }

    private void permutations(int n, List<Integer> curr, List<List<Integer>> ans, boolean[] map) {
        if (curr.size() == n) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        for (int i = 0; i < n; i++) {
            if (!map[i]) {
                map[i] = true;
                curr.add(i + 1);  // Fix: Use i + 1 because values are from 1 to n
                permutations(n, curr, ans, map);
                curr.remove(curr.size() - 1);
                map[i] = false;
            }
        }
    }
}
