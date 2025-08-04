public class MaxConsIII {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int zero = 0;
        int max = 0;

        while (r < nums.length) {
            if (nums[r] == 0) zero++;

            // If we have more than k zeros, move left pointer
            while (zero > k) {
                if (nums[l] == 0)  zero--;
                l++;
            }

            max = Math.max(max, r - l + 1);
            r++;
        }

        return max;
    }
}
