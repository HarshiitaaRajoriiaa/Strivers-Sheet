package Step04_BinarySearch_32.BS_as_Technique;

public class Bouquet {
    public static void main(String[] args) {

    }

    // *BRUTE FORCE APPROACH:
    // ! TC = 0(N)
    // public static boolean possible(int arr[], int day, int adj, int bouquets) {
    //     int count = 0;
    //     int noBouquets = 0;
    //     for (int i : arr) {
    //         if (i <= day) {
    //             noBouquets++;
    //         } else {
    //             noBouquets += count / bouquets;
    //             count = 0;
    //         }
    //     }
    //     noBouquets += count / bouquets;
    //     if (noBouquets >= bouquets)
    //         return true;
    //     return false;
    // }

    // min = min (arr[])
    // max = max (arr[])
    // for easy looping
    // !TC = 0((max-min+1)*N)
    public static int minDays(int arr[], int min, int max, int adj, int bouquets) {
        if (arr.length < adj * bouquets)
            return -1;
        for (int i = min; i <= max; i++) {
            if (possible(arr, i, adj, bouquets)) {
                return i;
            }
        }
        return -1;
    }

    // *OPTIMIZED APPROACH:
    public int minDays(int[] bloomDay, int m, int k) {
        int low = min(bloomDay);
        int high = max(bloomDay);
        return helper(bloomDay, low, high, k, m);
    }

    // Find the maximum value in the array
    static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            max = Math.max(max, num);
        }
        return max;
    }

    // Find the minimum value in the array
    static int min(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }
        return min;
    }

    public static int helper(int[] arr, int low, int high, int k, int m) {
        int n = arr.length;
        // If the total flowers are fewer than m * k, return -1
        if (n < k * m)
            return -1;

        int minDays = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (possible(arr, mid, k, m)) {
                minDays = mid;
                high = mid - 1; // Try to find a smaller minimum day
            } else {
                low = mid + 1;
            }
        }
        return minDays;
    }

    public static boolean possible(int[] arr, int days, int k, int m) {
        int count = 0; // Count of consecutive flowers that can bloom
        int bouquets = 0; // Count of bouquets formed
        for (int bloom : arr) {
            if (bloom <= days) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0; // Reset for the next bouquet
                }
            } else {
                count = 0; // Reset if the flower can't bloom by `days`
            }
            // If we have enough bouquets, return true
            if (bouquets >= m)
                return true;
        }
        return false;
    }

}
