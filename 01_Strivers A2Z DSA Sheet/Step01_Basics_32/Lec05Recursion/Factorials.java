package Lec05Recursion;
import java.util.ArrayList;
///?https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
public class Factorials {
    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(factorialNumbers(3));
        
    }
    //? factorial of N
    public static long fact(long N){
            if(N==0){
                return 1;
            }
            return N*fact(N-1);
        }
    // !TC = 0 (N)
   static ArrayList<Long> factorialNumbers(long n) {
    // code here
    ArrayList<Long> ans = new ArrayList<> ();
    long fac=1;
    for(int i=1;i<=n;i++){
        fac*=i;
        if(fac<=n) {
            ans.add(fac);
        }
        else {
            break;
        }
    }
    return ans;
}
}