//?https://www.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

public class CountInversions{
     static int inversions=0;
    public static void main(String[] args) {
    }
    // *BRUTE FORCE APPROACH
    //!TC =0(N^2) somewhere near (not exactly)
    static int inversionCount(int arr[]) {
        int inversions =0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]) inversions ++;
            }
        }
        return inversions;
    }


    //* OPTIMIZED APPROACH
    //*using merge sort: TC =0(NlogN)
    public static void  mergeSort(int arr[] ,  int start, int end){
        if(start>=end) return;
        int mid = (start+end)/2;
        //recursive call
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);
        //merge sorted array
        merge(arr, start, mid, end);
    }
    public static void merge(int arr[] , int low , int mid , int high){
        mid = (low+high)/2;
        int i = low;
        int j = mid+1;
        int temp[] = new int[high-low+1];
        int index =0;

        //comparing element and if i> j  we will put j in temp and j++ 
        while(i<=mid && j<=high){
            if(arr[i] > arr[j]){
                temp[index++] = arr[j++];
                inversions += (mid-i+1); //for each inversion we add mid-i+1
            }
            else{
                temp[index++] = arr[i++];
            }
        }
        while(i<=mid){
            temp[index++] = arr[i++];
        }
        while(j<=high){
            temp[index++] = arr[j++];
        }
        //copying temp array to original array
        for(int z=0;z<arr.length;z++){
            arr[z] = temp[z];
        }
        
    }

     public static int inversionCount2(int arr[]) {
        mergeSort(arr , 0 , arr.length-1);
        return inversions;
    }

}