package Step04_BinarySearch_32.BS_1D_Arrays;

public class RotatedSearchII {
    public static void main(String[] args) {
        
    }
    public boolean search(int[] nums, int target) {
        return helper(nums , 0 , nums.length-1 , target);
    }
     public static boolean helper(int[] arr, int low, int end, int target) {
        while (low <= end) {
            int mid = low + (end - low) / 2;
            // If the target is found, return true
            if (arr[mid] == target) {
                return true;
            }
            // Handle duplicates: if low, mid, and end are the same, move pointers inward
            if (arr[low] == arr[mid] && arr[mid] == arr[end]) {
                low++;
                end--;
                continue;
            }
            // If the left side is sorted
            if (arr[low] <= arr[mid]) {
                // Check if the target is within the sorted left part
                if (arr[low] <= target && target < arr[mid]) {
                    end = mid - 1;
                } else {
                    low = mid + 1;
                }
            } else {
                // The right side is sorted
                if (arr[mid] < target && target <= arr[end]) {
                    low = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        // If we exit the loop, the target was not found
        return false;
    }
}
