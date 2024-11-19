package Step04_BinarySearch_32.BS_1D_Arrays;

public class RotationCount {
    public static void main(String[] args) {
         
    }
    public int findMin(int[] nums) {
        return helper(nums , 0 , nums.length-1);
    }
    public static int helper(int arr[] , int low , int end ){
        int ans = Integer.MAX_VALUE;
        int index =-1;
        while(low<=end){
            int mid = low + (end-low)/2;
            //left part is sorted
            if(arr[low] <= arr[mid]) {
                if (arr[low] < ans) {
                    ans = arr[low];
                    index = low;
                }
                low = mid+1;
            }
            else {
                if (arr[mid] < ans) {
                    ans = arr[mid];
                    index = mid;
                }
                end = mid-1;
            }
        }
        return index;
    }
}
