package Step03_Arrays_40.Easy_13;

import java.util.*;

//?https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
public class SubArrayWithSumK {
    // * BRUTE FORCE METHOD: generate all sub-arrays of sum is K than find the
    // sub-array with length.
    // ! TC =0(N^3) approximately SC = 0(1)
    public static int SubArrayMaxLength(int arr[], int n, int k) {
        int MaxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int sum = sum(arr, i, j);
                if (sum == k)
                    MaxLength = Math.max(MaxLength, j - i + 1);
            }
        }
        return MaxLength;
    }
    public static int sum(int arr[], int l, int r) {
        int sum = 0;
        for (int i = l; i <= r; i++) {
            sum += arr[i];
        }
        return sum;
    }
    // *BETTER SOLUTION:
    // ! TC=0(N^2)
    public static int SubArrayMaxLengthBetter(int arr[], int n, int k) {
        int MaxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i + 1; j < n; j++) {
                sum += arr[j];
                if (sum == k)
                    MaxLength = Math.max(MaxLength, j - i + 1);
            }
        }
        return MaxLength;
    }

    // *Prefix sum array approach/ reversed Mathematics if any sub array has sum = x optimized approach for both positive and negative
    // , and if any sub array has sum {left !=0} is K, then there will any point sub
    // array {0 to i} where sum = x-K from that point we will consider array from.
    // ! TC = 0(N) and 0(N^2) approx is worst case when collisions occur in
    // hashmaps.
    public static int lenOfLongSubarrBetter2(int A[], int N, int K) {
        // Complete the function
        HashMap<Integer, Integer> prefixSum = new HashMap<>();
        int maxLength = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) { // TC=0(N)
            sum += A[i];
            if (sum == K) {
                maxLength = Math.max(maxLength, i + 1);
            }
            if (!prefixSum.containsKey(sum)) {
                prefixSum.put(sum, i);
            }
            int rem = sum - K;
            if (prefixSum.containsKey(rem)) {
                maxLength = Math.max(maxLength, i - prefixSum.get(rem));
            }
        }
        return maxLength;
    }

    // *OPTIMIZED APPROACH: 2 pointers approach and greedy.
    public static int lenOfLongSubarrPositive(int A[], int N, int K) {
        int l = 0, r = 0;
        int sum = 0;
        int length = 0;
        while (r < N) {
            sum += A[r];
            while (l <= r && sum > K) {
                sum -= A[l];
                l++;
            }
            if (sum == K) {
                length = Math.max(length, r - l + 1);
            }
            r++;
        }
        return length;
    }
}
