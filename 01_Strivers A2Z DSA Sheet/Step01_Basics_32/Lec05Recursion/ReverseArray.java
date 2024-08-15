package Lec05Recursion;
import java.util.ArrayList;
public class ReverseArray {
    public static void main(String[] args) {
        
    }
    public static void reverse(int arr[]){
        reverseArrayHelper1(arr, 0);
    }
    // can take (int arr[] , int i) and then reverse between arr[i] and arr[length-1-i].
    //single pointers
    public static void reverseArrayHelper1(int arr[] , int i){ 
        if(i>=arr.length/2) return;
        int temp = arr[i];
        arr[i] = arr[arr.length-1-i];
        arr[arr.length-1-i] = temp;
        reverseArrayHelper1(arr, i+1);
    }

    // 2 pointers
    public static void reverseArrayHelper2(int arr[] , int start, int end){ 
        if(start>=end) return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayHelper2(arr, start+1, end-1);
    }
}
