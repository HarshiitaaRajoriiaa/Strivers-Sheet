package Lec05Recursion;
import java.util.ArrayList;
//https://www.geeksforgeeks.org/problems/find-all-factorial-numbers-less-than-or-equal-to-n3548/0?problemType=functional&difficulty%255B%255D=-1&page=1&query=problemTypefunctionaldifficulty%255B%255D-1page1
public class FactorialsBtw12N {
    public static void main(String[] args) {
    }
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
