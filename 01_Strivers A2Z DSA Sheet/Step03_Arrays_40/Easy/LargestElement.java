package Step03_Arrays_40.Easy;

import java.util.Arrays;

//?https://www.geeksforgeeks.org/problems/largest-element-in-array4009/0
public class LargestElement {
    public static void main(String[] args) {
        
    }
    //* optimal solution method = TC == 0(N)
    public static int largest1(int n, int[] arr) {
        int l=-1;
        for(int i =0;i<n;i++){
            if(arr[i] > l) l = arr[i];
        }
        return l;
    }

    //* brute force method = TC == 0(NlogN)
    public static int largest2(int n, int[] arr) {
        Arrays.sort (arr);
        return arr[n-1];
    }

}
