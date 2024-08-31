package Step03_Arrays_40.Medium_14;
//?https://leetcode.com/problems/sort-colors/description/
public class SortColor {
    public static void main(String[] args) {
        
    }
    // *BETTER APPROACH: iterate over the array and count for each element.
    //! TC =0(2N) approximately
    public static void sort(int arr[] , int n){
        int zero = 0;
        int one = 0; 
        int two = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zero++;
            else if (arr[i] == 1) one++;
            else  two++;
        }
        for (int i = 0; i < zero; i++) arr[i] = 0;
        for (int i = zero; i < zero + one; i++) arr[i] = 1;
        for (int i = zero + one; i < n; i++) arr[i] = 2;
    }

    // *OPTIMAL APPROACH:
    //? Dutch National Flag Algorithm- DNF
    // 3 pointers approach:
    // [ zero , low-1] =  0  extreme left
    // [low+1 , mid-1] =  1 
    // [mid, high] =  random number in unsorted way
    // [high +1 , n-1] =  2 extreme right
    //in the beginning : mid = 0 : high = n-1;
    //! TC = 0(N)
    public static void sort012(int[] arr){
        int n = arr.length;
        int low = 0; 
        int mid = 0;  
        int high = n - 1;
        while (mid <= high) { //!TC = 0(N)
            if (arr[mid] == 0) {
                swap(low, mid, arr);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(mid, high, arr);
                high--;
            }
        }
    }
     public static void swap(int i, int j, int[] arr) { //!TC = 0(1) 
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
