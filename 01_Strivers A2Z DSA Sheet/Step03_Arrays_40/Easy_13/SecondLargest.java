package Step03_Arrays_40.Easy_13;
import java.util.List;
//?https://www.geeksforgeeks.org/problems/second-largest3735/1
public class SecondLargest {
    public static void main(String[] args) {
        
    }
    public int getSecondLargest(int[] arr) {
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
