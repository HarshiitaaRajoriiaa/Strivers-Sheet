package Step03_Arrays_40.Easy_14;
//?https://www.geeksforgeeks.org/problems/who-will-win-1587115621/1
public class LinearSearch {
    public static void main(String[] args) {
        
    }
    static int searchInSorted(int arr[], int N, int K) {

        // Your code here
        int ans =-1;
        for(int i=0;i<N;i++){
            if(arr[i]== K) 
            ans =1;
        }
        return ans;
    }
}
