package Subsequence;
import java.util.*;
public class NoSubseqsumk {
    public static void main(String[] args) {
        
    }
   public static int noOfSubSequence(int arr[] , int target){
    int count=0;
    int s=0;
    countHelper(arr, target, count,  0, s);


    
    return count;
        
   } 

   public static void countHelper(int arr[] , int target , int count , int i , int s){
        if(i==arr.length){
            if(s==target) count++;
        }
        //take and add
        s+=arr[i];
        countHelper(arr, target, count,  i+1 , s);
        //not -take and subtract
        s-=arr[i];
        countHelper(arr, target, count,  i+1, s);
   }


    

}
