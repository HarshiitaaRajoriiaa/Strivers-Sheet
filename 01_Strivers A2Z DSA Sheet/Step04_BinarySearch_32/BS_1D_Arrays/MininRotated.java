  package Step04_BinarySearch_32.BS_1D_Arrays;
 
 class MininRotated {
    public static void main(String[] args) {
        
    }
    public int findMin(int[] nums) {
        return helper(nums , 0 , nums.length-1);
    }
    public static int helper(int arr[] , int low , int end ){
        int ans = Integer.MAX_VALUE;
        while(low<=end){
            int mid = low + (end-low)/2;
            //left part is sorted
            if(arr[low] <= arr[mid]) {
                ans = Math.min(ans , arr[low]) ;
                low = mid+1;
            }
            else {
                ans = Math.min(ans , arr[mid]);
                end = mid-1;
            }
        }
        return ans;
    }
    
 }