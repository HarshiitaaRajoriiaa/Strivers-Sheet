import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        boolean map[] = new boolean[nums.length];
        helper(nums, ans, curr, map);
        return ans;

    }

    private void helper(int arr[], List<List<Integer>> ans, List<Integer> curr, boolean[] map) {
        if (curr.size() == arr.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        // pick with flag
        for (int i = 0; i < arr.length; i++) {
            if (map[i] == false) {
                map[i] = true;
                curr.add(arr[i]);
                helper(arr, ans, curr, map);





                
                curr.remove(curr.size() - 1);
                map[i] = false;
            }
        }
    }
}
