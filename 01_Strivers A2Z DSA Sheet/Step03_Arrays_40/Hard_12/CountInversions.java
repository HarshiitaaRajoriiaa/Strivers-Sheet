//?https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1
public class CountInversions{
    public static void main(String[] args) {
        
    }
    // *BRUTE FORCE APPROACH
    //!TC =0(N^2)
    public static long inversionCount(long arr[]) {
        // Your Code Here
        // in arr[] = [ 2,4,1,3,5] (2,1) , (4,1) , (4,3)
        int count =0;
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]) count++;
            }
        }
        return count;
    }
}