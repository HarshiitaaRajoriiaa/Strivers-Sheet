package VariableSize;

public class LongestSubArrayWithK {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 7, 5 };
        int sum = 12;
        System.out.println(maxLength(arr, sum));

    }

    // *BRUTE FORCE METHOD: iterating all the possible subarrays and find the maximum length of subarrays whose sum are equal to 'sum'
    // ! TC =0(N*N)
    public static int maxLength(int arr[], int sum) {

        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = 0;
            for (int j = i; j < arr.length; j++) {
                s += arr[j];
                if (s == sum) max = Math.max(max, j - i + 1);
                else if (s>= sum) break;
            }
        }
        return max;
    }
    public static int maxLengthO(int arr[] , int K){
        int l=0;
        int r=0;
        int sum=0;
        int max = 0;
        sum = arr[r];
        while(r<arr.length){
            if(sum==K) max = Math.max(max , r-l+1);
            else if(sum > K) {
                while(sum>=K) {
                    sum -= arr[l];
                    l++;
                }
            }
            r++;
            sum += arr[r];
        }
        return max;
    }
}
