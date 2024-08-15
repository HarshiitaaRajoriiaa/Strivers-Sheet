package Step02_Sorting_7;
//?https://www.geeksforgeeks.org/problems/insertion-sort/0?category%5B%5D=Algorithms&page=1&query=category%5B%5DAlgorithmspage1
public class InsertionSort {
    public static void main(String[] args) {
        
    }
    //!TC = 0(N*N) approx
    public void insertionSort(int arr[], int n){
        for(int i =0;i<n;i++){
            int curr =i+1;
            while(curr>0 && arr[curr-1] > arr[curr]){
                int temp = arr[curr-1];
                arr[curr-1] = arr[curr];
                arr[curr] = temp;
                curr--;
            }
        }
    }
}


/*
 * Insertion sort : insert the element in it's correct position. while right shifting other elements.
 */
