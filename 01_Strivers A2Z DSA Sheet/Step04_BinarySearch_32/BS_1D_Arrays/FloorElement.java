package Step04_BinarySearch_32.BS_1D_Arrays;
//?https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
public class FloorElement {
    public static void main(String[] args) {
        
    }
    static int findFloor(int[] arr, int k) {
        // write code here
        return upperBound(arr , 0 , arr.length-1 , k);
    }
     static int upperBound(int arr[] , int low , int end , int target){
         int index=-1;
         while(low<=end){
             int mid = (low+end)/2;
             if(arr[mid]<=target) {
                 index = mid;
                 low = mid+1;
             }
             else {
                 end = mid-1;
             }
         }
         return index;
     }
}
