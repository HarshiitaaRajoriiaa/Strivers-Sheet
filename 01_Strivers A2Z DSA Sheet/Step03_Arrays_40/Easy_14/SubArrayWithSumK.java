package Step03_Arrays_40.Easy_14;
import java.util.*;
//?https://www.geeksforgeeks.org/problems/longest-sub-array-with-sum-k0809/1
public class SubArrayWithSumK {
    public static void main(String args[]){

    }
    //* BRUTE FORCE METHOD: generate all sub-arrays of sum is  K than find the sub-array with length.
    //! TC =0(N^3) approximately SC = 0(1)
    public static int SubArrayMaxLength(int arr[], int n, int k){
        int MaxLength = 0;
        for(int i=0;i<n;i++){
            for (int j = i; j < n; j++) {
                int sum = sum(arr ,i ,j );
                if(sum == k) MaxLength = Math.max(MaxLength,j-i+1);
            }
        }
        return MaxLength;
    }
    public static int sum(int arr[] , int l , int r){
        int sum=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        return sum;
    }   
    // *BETTER SOLUTION: Prefix sum / at any index of Prefix-sum array where sum is x and  if at any position left to the index there is present sum with x-K we will get that particular sub array with sum K
    // public static  int subArraySumKBetter(int arr[] ){
    //     HashMap<Integer , Integer> prefixSum = new HashMap<>();
    //     int sum=0;
    //     for (int i = 0; i < arr.length; i++) {
    //         sum +=arr[i];
    //         prefixSum.put(i , sum);
    //     }
    //     int length =-1;

    }
// }
