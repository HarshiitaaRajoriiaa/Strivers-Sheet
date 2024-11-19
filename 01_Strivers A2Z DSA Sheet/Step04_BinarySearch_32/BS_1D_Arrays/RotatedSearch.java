package Step04_BinarySearch_32.BS_1D_Arrays;

public class RotatedSearch {
    public static void main(String[] args) {
        
    }
    public int search(int[] nums, int target) {
        // Start the binary search with the full array range
        return helper(nums, 0, nums.length - 1, target);
    }
    public static int helper(int[] arr, int low, int end, int target) {
        while (low <= end) {
            int mid = low + (end - low) / 2; // Avoid potential overflow

            // If the target is found at mid, return the index
            if (arr[mid] == target) {
                return mid;
            }

            // Check if the left part is sorted
            if (arr[low] <= arr[mid]) {
                // Check if the target is in the sorted left part
                if (arr[low] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // The right part must be sorted
                // Check if the target is in the sorted right part
                if (arr[mid] < target && target <= arr[end]) {
                    low = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // Target not found
        return -1;
    }
}
