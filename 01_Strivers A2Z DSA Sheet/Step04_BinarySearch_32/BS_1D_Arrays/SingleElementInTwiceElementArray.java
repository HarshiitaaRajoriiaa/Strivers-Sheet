package Step04_BinarySearch_32.BS_1D_Arrays;

public class SingleElementInTwiceElementArray {

    public static void main(String[] args) {
         
    }
    public int singleNonDuplicate(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    public static int helper(int arr[], int low, int end) {
        // Edge cases
        if (arr.length == 1) return arr[0];
        if (arr[0] != arr[1]) return arr[0];
        if (arr[arr.length - 2] != arr[arr.length - 1]) return arr[arr.length - 1];

        // Binary search to find the single non-duplicate
        while (low <= end) {
            int mid = low + (end - low) / 2;

            // Check if the mid element is the non-duplicate
            if (arr[mid] != arr[mid + 1] && arr[mid] != arr[mid - 1]) {
                return arr[mid];
            }

            // Decide the search direction based on the mid index parity
            if ((mid % 2 == 0 && arr[mid] == arr[mid + 1]) || (mid % 2 == 1 && arr[mid] == arr[mid - 1])) {
                // Move to the right half
                low = mid + 1;
            } else {
                // Move to the left half
                end = mid - 1;
            }
        }

        // If no single element is found, return -1 (shouldn't happen in a valid input)
        return -1;
    }
} 