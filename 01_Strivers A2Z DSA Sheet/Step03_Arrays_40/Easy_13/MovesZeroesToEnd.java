package Step03_Arrays_40.Easy_13;
import java.util.*;
//?https://leetcode.com/problems/move-zeroes/description/
public class MovesZeroesToEnd {
    public static void main(String[] args) {

    }
    //* solution 1 : TC = 0(N) / LEARNYARD
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int lastNonZeroFoundAt = 0; // Pointer for the last non-zero element
        // If the current element is not zero, then we need to append it just in front
        // of the last non-zero element we found.
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[lastNonZeroFoundAt] = nums[i];
                lastNonZeroFoundAt++;
            }
        }
        // After we have finished processing new elements, all the non-zero elements are
        // already at the beginning of the array.
        // We just need to fill the remaining array with 0's.
        for (int i = lastNonZeroFoundAt; i < n; i++) {
            nums[i] = 0;
        }
    }

    //*BRUTE FORCE METHOD: TC = 0(2N) SC = 0(temp.size())
    public static void movesZeroesToEndBruteForce(int arr[] , int n){
        ArrayList<Integer> temp= new ArrayList<>();
        for(int i=0;i<n;i++) { //TC = 0(N)
            if(arr[i] !=0) temp.add(arr[i]);
        }
        for (int i = 0; i < temp.size(); i++) { //Temp.size().
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < arr.length; i++) { //n-temp.size().
            arr[i] = 0;
        }
    }
    //*OPTIMAL SOLUTION TC =0(N)
    public static void moveZeros(int n, int []a) {
        int j = -1;
        //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (a[i] == 0) {
                j = i;
                break;
            }
        }
        //no non-zero elements:
        if (j == -1) return;
        //Move the pointers i and j
        //and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (a[i] != 0) {
                //swap a[i] & a[j]:
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
    }
}
