package Lec06Hashing;
import java.util.Arrays;

//Given an array of integers nums and an integer k, return the maximum frequency of a value in the array such that there are k or more occurrences of that value in the array.
//https://leetcode.com/problems/frequency-of-the-most-frequent-element/
public class HighestLowestFrequency {
    public static void main(String[] args) {
    }
    public int maxFrequency(int[] nums, int k) {
        Arrays.sort(nums);
        int l=0 , r=0;
        long total = 0;
        int res =0;
        while(r<nums.length){
            total+=nums[r];
            while(nums[r]*(long)(r-l+1) > total+k){
                total-=nums[l];
                l++;
            }
            res = Math.max(res, r-l+1);
            r++;
        }
        return res;
    }
}
