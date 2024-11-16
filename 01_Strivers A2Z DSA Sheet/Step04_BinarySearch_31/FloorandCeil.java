package Step04_BinarySearch_31;
//?https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
import java.util.Arrays;

public class FloorandCeil {
    public static void main(String[] args) {
        
    }
    public int[] getFloorAndCeil(int x, int[] arr) {
        // code here
         return new int[]{floor(arr , 0 , arr.length-1 , x) , ceil(arr , 0 , arr.length-1 , x)}; 
        
    }


    // * Lower bound
    static  int floor(int arr[] , int low , int high , int target){
        Arrays.sort(arr);
        int ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target>=arr[mid]){
                ans = arr[mid];
                low = mid+1;
            }
            else{
                high = mid-1;
            }
             
        }
        return ans;
    }


    // * Upper bound
    static int  ceil(int arr[] , int low , int high , int target){
        Arrays.sort(arr);
        int ans =-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(target<=arr[mid]){
                ans = arr[mid];
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}
