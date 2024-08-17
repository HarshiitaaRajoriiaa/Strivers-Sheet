package Step03_Arrays_40.Easy;
//?https://leetcode.com/problems/max-consecutive-ones/
public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int max =0;
        int curr =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==1) {
                curr++;
                max = Math.max(curr , max);
            }
            if(nums[i] == 0) {
                curr =0;
            }
        }
        return max;
    }
}
