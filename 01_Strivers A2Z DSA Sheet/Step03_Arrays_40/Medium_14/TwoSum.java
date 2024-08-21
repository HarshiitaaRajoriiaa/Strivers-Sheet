package Step03_Arrays_40.Medium_14;

import java.util.HashMap;

//?https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {
        
    }
    // * BRUTE FORCE METHOD: TC = 0(N*N)
    //check for every element with every does they sum up to give number equal to target or not
    public static int [] twoSum(int arr[] , int n , int target){
        int ans[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] =j;
                }
            }
        }
        return ans;
    }

    // *BETTER APPROACH :
    //compliment approach.
    
}
