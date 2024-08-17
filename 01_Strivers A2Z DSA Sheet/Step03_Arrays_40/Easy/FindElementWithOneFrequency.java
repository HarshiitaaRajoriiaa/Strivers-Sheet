package Step03_Arrays_40.Easy;

import java.util.HashMap;

//?https://leetcode.com/problems/single-number/
public class FindElementWithOneFrequency {
    public static void main(String[] args) {
        
    }
    //* BRUTE FORCE METHOD: TC = 0(N*N)
     public static int singleNumber(int[] nums) {
         for (int i = 0; i < nums.length; i++) {
             int count = 0;
             for (int j = 0; j < nums.length; j++) {
                 if (nums[i] == nums[j]) {
                     count++;
                 }
             }
             if (count == 1) {
                 return nums[i];
             }
         }
         return -1;
     }
    // *BETTER APPROACH: TC=0(3N)
    public static int largest1(int n, int[] arr) {
        int l = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (arr[i] > l) l = arr[i];
        }
        return l;
    }
    public int singleNumberBetter(int[] nums) {
        int max = largest1(nums.length, nums);
        int min = Integer.MAX_VALUE;
        // Find the minimum value to handle negative numbers
        for (int num : nums) { //TC =0(N)
            if (num < min) min = num;
        }
        //here min= 0 or less than if exist in array.
        int range = max - min + 1;
        int[] freq = new int[range];
        for (int i = 0; i < nums.length; i++) { //TC =0(N)
            freq[nums[i] - min]++;
        }
        for (int i = 0; i < range; i++) { //TC =0(N)
            if (freq[i] == 1) return i + min;
        }
        return -1;
    }

    public int singleNumberHashMapBetter(int[] nums) {
        HashMap<Integer , Integer> freq = new HashMap<>();
        for(int num : nums) {
            freq.put(num , freq.getOrDefault(num , 0 ) +1); //nlogn
            //getOrDefault(num, 0) 
            //returns the current count of num if it exists in the map; otherwise, it returns 0. This is perfect for incrementing the frequency of each number.
        }
        for (int num : nums) {
            if (freq.get(num) == 1) {
                return num;
            }
        }
        return -1;
    }


    //! OPTIMIZED APPROACH: TC =0(N) SC =0(1)
    //*using xor property:
    public static int xorMethod(int arr[]){
        int n =arr.length;
        int xor =0;
        for(int i =0;i<n;i++){
            xor = xor^arr[i];
        }
        return xor;
    }
}
