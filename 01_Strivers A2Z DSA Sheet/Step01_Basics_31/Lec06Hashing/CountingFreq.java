package Lec06Hashing;
//https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class CountingFreq {
    public static void main(String[] args) {
        
    }
    public static void frequencyCount(int arr[], int N, int P) {
        // Step 1: Create an auxiliary array to store frequencies
        int[] frequency = new int[N + 1]; // N+1 because we're using 1-based indexing

        // Step 2: Traverse the original array and count frequencies
        for (int i = 0; i < N; i++) {
            if (arr[i] >= 1 && arr[i] <= N) {
                frequency[arr[i]]++;
            }
        }
        // Step 3: Update the original array with the frequencies
        for (int i = 1; i <= N; i++) {
            arr[i - 1] = frequency[i];
        }
    }
    
}
