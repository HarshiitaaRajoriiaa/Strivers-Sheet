package Step03_Arrays_40.Easy_13;
import java.util.Arrays;
import java.util.List;
//?https://www.geeksforgeeks.org/problems/second-largest3735/1
public class SecondLargest {
    public static void main(String[] args) {
        
    }
    // * BRUTE FORCE APPROACH-
    public int getSecondLargest(int[] arr) {
        Arrays.sort(arr);
        for(int  i= arr.length - 1; i>=0; i--) {
            if(arr[i]!=arr[i-1]) return arr[i-1];  // If the current element is not equal to the previous one, it's the second largest.
        }
        return -1;
    }
    // worst case : {1 ,7 , 7 , 7 , 7 }


    // *OPTIMAL APPROACH-
    public int getSecondLargestO(int[] arr) {
        // Code Here
        if(arr.length==0 || arr.length == 1) return -1;
        int max = -1;
        int sMax = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > max) {
                sMax = max;
                max = arr[i];
            }
            if(arr[i] > sMax && arr[i] != max) sMax = arr[i];  
        }
        return sMax;
    }
}
