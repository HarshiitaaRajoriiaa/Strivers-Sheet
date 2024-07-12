package Lec06Hashing;

public class HighestLowestFrequency {
    public static void main(String[] args) {
        int arr[] = {3, 3, 3};
        int N  = 4;
        int P = 3;
        frequencyCount(arr, N, P);
        
    }
    public static void frequencyCount(int arr[], int N, int P)
    {   int frequency[] = new int[P+1];//new hash array
        int curr = 0;
        for(int i = 0;i<N;i++){
            curr = arr[i];
            frequency[curr]++;
        }
        for(int i = 0;i<P+1;i++){
            System.out.print(frequency[i] + " ");
        }
    } 
}
