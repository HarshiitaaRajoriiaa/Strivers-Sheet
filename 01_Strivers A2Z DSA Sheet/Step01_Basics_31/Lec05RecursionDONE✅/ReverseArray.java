package Lec05Recursion;

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        
    }
    public static void reverse(int arr[]){
        reverseArrayHelper(arr, 0, arr.length-1);
    }
    public static void reverseArrayHelper(int arr[] , int start, int end){
        if(start>=end) 
        return;
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseArrayHelper(arr, start+1, end-1);
    }
}
