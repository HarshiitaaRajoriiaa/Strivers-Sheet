package Lec05Recursion;

import java.util.ArrayList;

public class ReverseArray {
    public static void main(String[] args) {
        
    }
    public static void reverseArray(ArrayList<Integer> arr, int m)
    {
        // Write your code here.
        int start = m + 1;
        int end = arr.size() - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = arr.get(start);//initial
            arr.set(start, arr.get(end));
            arr.set(end, temp);
            start++;
            end--;
        }
    
    }
}
