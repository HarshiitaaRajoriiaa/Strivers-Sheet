package Step04_BinarySearch_32.BS_1D_Arrays;
public class PeakElement {
    public static void main(String[] args) {
        
    }
    class Solution {
        public int findPeakElement(int[] nums) {
            return helper(nums, 0, nums.length - 1);
        }
    
        public static int helper(int arr[], int low, int high) {
            int n = arr.length;
            if (arr.length == 1) return 0;
            if (arr[0] > arr[1]) return 0;
            if (arr[n - 1] > arr[n - 2]) return n - 1;
            low = 1;
            high = n-2;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] > arr[mid - 1] && arr[mid] > arr[mid + 1]) return mid;
                if (arr[mid] > arr[mid - 1])  low = mid + 1;
                else high = mid - 1;
            }
            return -1;
        }
    }
}
