package Step02_Sorting_7;
//?https://www.geeksforgeeks.org/problems/merge-sort/1
public class MergeSort {
    public static void main(String[] args) {
        
    }

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
        int temp[] = new int[arr.length];
        int index =0;

        //comparing element and if i> j  we will put j in temp and j++ 
        while(i<=mid && j<=high){
            if(arr[i]> arr[j]){
                temp[index++] = arr[j++];
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
    
}
