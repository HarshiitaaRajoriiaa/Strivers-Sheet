import java.util.*;

public class MergeSort {
    public static void main(String[] args) {

    }
    public static void mergeSort(int arr[]){
        int n =  arr.length;
        if(n<=1) return;
        int mid = n/2;
        merge(arr , 0 , n);
        merge(arr , mid , n);

    }

    public static void merge(int arr[] , int low , int end){
        int n =arr.length;
        int mid = (low+end)/2;
        int i = low;
        int j = mid+1;
        ArrayList<Integer> sorted = new ArrayList<Integer>();
        while(low>=mid){
            if(arr[i]>=arr[j]){
                sorted.add(arr[j]);
                j++;
            }
            if(arr[j]>=arr[i]){
                sorted.add(arr[i]);
                i++;
            }
        }
        while(j<=end){
            sorted.add(arr[j]);
            j++;
        }
        while(i<=mid){
            sorted.add(arr[i]);
            i++;
        }
    }
}
