package Step03_Arrays_40.Easy_14;

//?https://leetcode.com/problems/rotate-array/?
public class RotateArrayByDPlaces {
    public static void main(String[] args) {

    }

    // ! BRUTE FORCE APPROACH: TC = 0 (n+d)
    public static void rotateArrayByDPlacesBrute(int arr[], int d) {
        int n = arr.length;
        int temp[] = new int[d];
        for (int i = 0; i < d; i++) {
            temp[i] = arr[i];
        }
        // *shifting
        for (int i = d; i < arr.length; i++) {
            arr[i - d] = arr[i];
        }
        for (int i = 0; i < d; i++) {
            arr[n - d + i] = temp[i];
        }
    }
    //! optimized solution:
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n; // In case k is greater than the length of the array
        // Reverse the entire array
        reverse(nums, 0, n - 1);
        // Reverse the first k elements
        reverse(nums, 0, k - 1);
        // Reverse the remaining n - k elements
        reverse(nums, k, n - 1);
    }

    public static void reverse(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
