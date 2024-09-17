package ConstantSize;
//?https://www.geeksforgeeks.org/problems/ipl-2021-match-day-2--141634/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card)

import java.util.ArrayList;

public class IPLMatch {
    public static void main(String[] args) {
        
    }
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k) {
        // Your code here
        ArrayList<Integer> ans=new ArrayList<>();
        int l=0, r=k-1;
        while(r<n){
            ans.add(max(arr , l , r));
            r++;
            l++;
        }
        return ans;
    }
    
    
    
    
    //return maximum number of subarray:
    public static int max(int arr[],  int i , int j){
        int num=0;
        for(int k=i;k<=j;k++){
            num = Math.max(num , arr[k]);
        }
        return num;
    }
}
