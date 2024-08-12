//? https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
public class FirstandLastIndexInSortedArray {
    public static void main(String[] args) {
        
    }
    //!TC = 0(N) === required (logN)
    public static int[] indexPair(int arr[], int x, int n){
        int first =-1 , last = -1;
        for(int i=0;i<n;i++){
            if(arr[i]==x){
                if(first==-1) first = i;
                last = i;
            }
        }
        return new int[] {first,last};
    }
}
