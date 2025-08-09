package Subsequence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, curr, ans);
        return ans;

    }

    private void helper(int arr[], int t, int ind, List<Integer> curr, List<List<Integer>> ans) {
        if (t == 0){
            ans.add(new ArrayList<>(curr));
            return;
        }    
        

        for(int i=ind;i<arr.length;i++){
            if(i>ind && arr[i]== arr[i-1]) continue; //i>ind : add current number and avoid afterwards same numbers
            if(arr[i]>t) break;
            curr.add(arr[i]);
            helper(arr ,t-arr[i],i+1,curr,ans);
            curr.remove(curr.size()-1); //doesn't adding not pick recursion call because loop itself managing pick and not pick cases , we just need call for next index.
        }        
    }
}
