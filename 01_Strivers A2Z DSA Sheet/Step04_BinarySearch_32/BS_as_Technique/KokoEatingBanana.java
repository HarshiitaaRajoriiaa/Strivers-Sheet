package Step04_BinarySearch_32.BS_as_Technique;

public class KokoEatingBanana {
    public static void main(String[] args) {   
    }
    public int minEatingSpeed(int[] piles, int h) {
        int high = max(piles);
        return helper(piles, 1, high, h);
    }
    // Finds the maximum number of bananas in any pile
    int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int banana : arr) {
            max = Math.max(max, banana);
        }
        return max;
    }

    // Binary search to find the minimum speed that works
    int helper(int[] arr, int low, int high, int hours) {
        int min = Integer.MAX_VALUE;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int totalHours = bananaPerHour(arr, mid);
            // Check if mid is a valid speed
            if (totalHours <= hours) {
                min = Math.min(mid , min);   // Update min speed if valid
                high = mid - 1;  // Search for a potentially smaller speed
            } else {
                low = mid + 1;  // Increase the speed if it's not enough
            }
        }
        return min;
    }

    // Calculate the total time required to eat all bananas at the given speed
    int bananaPerHour(int[] arr, int bPerHour) {
        int totalTime = 0;
        for (int banana : arr) {
            // Use (banana + bPerHour - 1) / bPerHour to mimic Math.ceil(banana / bPerHour)
            totalTime += (int)Math.ceil((double)banana/(double)bPerHour);
        }
        return totalTime;
    }
}
