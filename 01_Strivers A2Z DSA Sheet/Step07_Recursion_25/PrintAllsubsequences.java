
package Subsequence;

import java.util.ArrayList;
import java.util.List;


public class PrintAllsubsequences {
    public static void printSubsequences(String input) {
        // Write your code here
        StringBuilder output = new StringBuilder();
        helper(input, 0, output);

    }

    public static void helper(String input, int index, StringBuilder output) {
        if (index == input.length()) {
            System.out.println(output.toString());
            return;
        }

        // Include current character
        output.append(input.charAt(index));
        helper(input, index + 1, output);

        // Backtrack and exclude current character
        output.deleteCharAt(output.length() - 1);
        helper(input, index + 1, output);
    }




    //? https://leetcode.com/problems/subsets/
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        helper(nums , 0 ,  curr , ans);
        return ans;
    }


    public void helper(int[] nums , int i , List<Integer> curr ,  List<List<Integer>> ans ){
        if(i==nums.length) {
            ans.add(new ArrayList<>(curr));
            return;
        }

        //take
        curr.add(nums[i]);
        helper(nums, i+1 ,curr ,  ans);


        //not-take
        curr.remove(curr.size() - 1);
        helper(nums , i+1 , curr, ans);
    }
}
