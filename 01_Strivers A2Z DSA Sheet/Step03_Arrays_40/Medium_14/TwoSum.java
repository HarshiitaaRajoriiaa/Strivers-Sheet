package Step03_Arrays_40.Medium_14;

import java.util.Arrays;
import java.util.HashMap;

//?https://leetcode.com/problems/two-sum/description/
public class TwoSum {
    public static void main(String[] args) {

    }
    // * BRUTE FORCE METHOD: TC = 0(N*N)
    // check for every element with every does they sum up to give number equal to
    // target or not
    public static int[] twoSum(int arr[], int n, int target) {
        int ans[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }

    // *BETTER APPROACH :
    // compliment approach.
    // ?https://www.naukri.com/code360/problems/reading_6845742?leftPanelTabValue=SUBMISSION
    public static String read(int n, int[] book, int target) {
        String ans = "NO";
        HashMap<Integer, Integer> present = new HashMap<>(); 
        // *hashmap = Key :element -> value:index
        for (int i = 0; i < n; i++) {
            int a = book[i];
            int compliment = target - a;
            if (present.containsKey(compliment))
                ans = "YES";
            if (!present.containsKey(book[i]))
                present.put(book[i], i);
        }
        return ans;
    }

    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> present = new HashMap<>();
        for (int i = 0; i < arr.length; i++) { //TC =0(N)
            int a = arr[i];
            int complement = target - a;
            if (present.containsKey(complement)) {  //TC =0(N^2) worst case / collisions
                return new int[] { present.get(complement), i };// Return the result as soon as a pair is found
            }
            if (!present.containsKey(a)) { //TC =0(1)
                present.put(a, i);
            }
        }
        return new int[0];
    }

    // *MUCH BETTER APPROACH:
    // Using two-pointer technique and greedy
    public static String twoSumPointer(int[]arr , int target , int n){
        String ans ="NO";
        int l=0,r=n-1;
        int arr2[] = Arrays.copyOf(arr,n);
        for(int i=0;i<arr.length;i++){
            if(arr2[l]+arr2[r]==target){
                ans = "YES";
            }
            while(l<r && arr2[l]+arr2[r]!=target){
                if(arr2[l]+arr2[r]<target)
                    l++;
                else
                    r--;
            }
        }
        return ans;
    }

}
