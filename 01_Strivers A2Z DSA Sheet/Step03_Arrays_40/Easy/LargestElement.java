package Step03_Arrays_40.Easy;
//https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
public class LargestElement {
    public static void main(String[] args) {
        
    }
    public static int largest(int n, int[] arr) {
        // code here
        int l=-1;
        for(int i =0;i<n;i++){
            if(arr[i] > l) l = arr[i];
        }
        return l;
    }
}
