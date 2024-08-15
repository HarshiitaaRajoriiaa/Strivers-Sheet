package Step02_Sorting_7;
//?https://www.geeksforgeeks.org/problems/selection-sort/1
public class SelectionSort {
    public static void main(String[] args) {

    }
    //! TC = 0 (N)
    public static void selectionSort(int[] arr) {
        for(int i = 0 ; i < arr.length-1;i++){
            minSelectandSwap(arr, i); // !TC = 0(N*N)  approx
        }
    }
    // return index of minimum element
    //!TC = 0 (N)
    public static void minSelectandSwap(int arr[] , int i){
        int min = Integer.MAX_VALUE; 
        int index = -1;   
        for(int j=i; j<arr.length; j++){
            if(arr[j] < min) {
                min = arr[j];
                index = j;
            }
        }
        int temp = arr[i];
        arr[i] = arr[index];
        arr[index] = temp;
    }
}
/* 
* Selection sort:  select the minimum from the array and swap it with first element of the array.
* then repeat this excepting the first element and now considering array from 1 to n-1.
  */