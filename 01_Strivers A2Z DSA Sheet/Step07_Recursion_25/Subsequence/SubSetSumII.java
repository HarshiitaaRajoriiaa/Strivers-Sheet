package Subsequence;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSetSumII {
    public static void main(String[] args) {
        
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        Arrays.sort(nums);
        helper(nums , 0, ans ,curr);
        return ans;
        
    }


    private void helper(int arr[] , int i , List<List<Integer>> ans , List<Integer> curr ){
        ans.add(new ArrayList<>(curr));
        for(int a=i;a<arr.length;a++){
            if(a!=i && arr[a]==arr[a-1]) continue;
            curr.add(arr[a]);
            helper(arr , a+1 , ans , curr);
            curr.remove(curr.size()-1);
        }
    }
}
