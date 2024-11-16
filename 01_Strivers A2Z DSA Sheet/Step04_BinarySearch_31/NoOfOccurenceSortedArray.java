package Step04_BinarySearch_31;

public class NoOfOccurenceSortedArray {
    public static void main(String[] args) {
        
    }
    int countFreq(int[] arr, int target) {
        // code here
        int first = startIndex(arr , 0 , arr.length-1 , target);
        if(first==-1) return 0;
        int count = (endIndex(arr,0,arr.length-1,target) - startIndex(arr , 0 , arr.length-1 , target)) +1;
        return count;
    }
    static int startIndex(int arr[] , int low , int end , int target){
        int startIndex = -1;
        while(low<=end){
            int mid = (low + end)/2;
            if(arr[mid]==target){
                startIndex = mid;
                end = mid-1;
            }
            else if(arr[mid]<target) low = mid+1;
            else end = mid-1;
        }
        return startIndex;
    }
    static int endIndex(int arr[] , int low , int end , int target){
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
