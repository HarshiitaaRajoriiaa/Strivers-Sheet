package Step04_BinarySearch_32.BS_1D_Arrays;
public class FirstandLastOccurence {
    public static void main(String[] args) {
        
    }

    // Find the first occurrence (Lower Bound)
    static int startIndex(int arr[], int low, int end, int target) {
        int startIndex = -1;
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] == target) {
                startIndex = mid;
                end = mid - 1; // Narrow down to the left side to find the first occurrence
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return startIndex;
    }

    // Find the last occurrence (Upper Bound)
    static int endIndex(int arr[], int low, int end, int target) {
        int endIndex = -1;
        while (low <= end) {
            int mid = (low + end) / 2;
            if (arr[mid] == target) {
                endIndex = mid;
                low = mid + 1; // Narrow down to the right side to find the last occurrence
            } else if (arr[mid] < target) {
                low = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return endIndex;
    }
}
