package Step04_BinarySearch_31;
//?https://leetcode.com/problems/search-insert-position/
public class SearchOrInsert {
    public static void main(String[] args) {

    }

    public int searchInsert(int[] nums, int target) {
        return helper(nums, 0, nums.length - 1, target);
    }

    static int helper(int arr[], int low, int end, int target) {
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] == target) {
                return mid; // Element found, return the index
            } else if (arr[mid] < target) {
                low = mid + 1; // Move right
            } else {
                end = mid - 1; // Move left
            }
        }
        // When the loop ends, `low` is the insert position
        return low;
    }
}
