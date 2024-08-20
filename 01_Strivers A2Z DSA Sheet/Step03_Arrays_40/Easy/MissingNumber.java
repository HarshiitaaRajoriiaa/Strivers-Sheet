package Step03_Arrays_40.Easy;
//?https://leetcode.com/problems/missing-number/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int index =-1;
        int freq[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++) {
            freq[nums[i]]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i] ==0) {
                index =i;
                break;
            }
        }
        return index;
     }
}
