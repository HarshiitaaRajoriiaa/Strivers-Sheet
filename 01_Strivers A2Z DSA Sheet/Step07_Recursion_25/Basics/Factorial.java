package Basics_Step01_Striver;
//?https://www.geeksforgeeks.org/problems/factorial5739/1?itm_source=geeksforgeeks&itm_medium=article&itm_campaign=practice_card
public class Factorial {
    //! TC =0(N)
    // *RECURSION 
    static long factorialRecursion(int N){
        // code here
        if(N==1) return N;
        return N*factorialRecursion(N-1);   
    }
    public static int  factorial2(int n){
        if (n ==0 ) return 1;
        int result  = n * factorial2(n-1);
        return result;
    }
    // *BRUTE FORCE 
    //! TC =0(N)
    static long factorialBrute(int N){
        // code here
        long result =1;
        for(long i=1;i<=N;i++){
            result *=i;
        }
        return result;
    }
    
    
   

}
