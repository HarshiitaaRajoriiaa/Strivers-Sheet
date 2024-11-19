package Step04_BinarySearch_32.BS_1D_Arrays;
//?https://leetcode.com/problems/binary-search/description/
public class BinarySearch {
    public static void main(String[] args) {
        
    }
    public static int binarySearch(int arr[] , int target){
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right)/2;
        while(left <= right){
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] < target){
                left = mid + 1;
            }
            else{
                right = mid - 1;
            }
            mid = (left + right)/2;
        }
        return -1;
    }

    //in case of overflow : mid = low + (high - low)/2


    public static int binarySearchRecursive(int arr[], int target, int left, int right){
        if(left>right) return -1;
        int mid = (left + right)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return binarySearchRecursive(arr, target, mid + 1, right);
        }
        if(arr[mid] > target){
            return binarySearchRecursive(arr, target, left, mid - 1);
        }
        return -1;
    }
    


}


