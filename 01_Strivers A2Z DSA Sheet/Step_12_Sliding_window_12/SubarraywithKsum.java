//?https://leetcode.com/problems/subarray-sum-equals-k/description/

import java.util.HashMap;

public class SubarraywithKsum {
    // *Brute Force
    // ! TC=0(N*N)
    public int subarraySum(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k)
                    ans++;
            }
        }
        return ans;
    }

    // *Optimistic Approach
    // ! TC=0(2N)
    public int subarraySumO(int[] nums, int k) {
        int ans = 0;

        // Create the prefix sum array
        int prefix[] = new int[nums.length];
        prefix[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefix[i] = nums[i] + prefix[i - 1];
        }
        // Prefix sum array ready

        // Create a HashMap to store the frequency of each prefix sum
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Populate the freq HashMap and simultaneously check for subarrays
        for (int i = 0; i < nums.length; i++) {
            // Case when the subarray from the beginning to i has sum k
            if (prefix[i] == k)
                ans++;
            // Check if there's a prefix sum such that prefix[j] = prefix[i] - k
            if (freq.containsKey(prefix[i] - k)) {
                ans += freq.get(prefix[i] - k); // Add the count of such subarrays
            }
            // Update the frequency map with the current prefix sum
            freq.put(prefix[i], freq.getOrDefault(prefix[i], 0) + 1);
        }
        return ans;
    }
}
