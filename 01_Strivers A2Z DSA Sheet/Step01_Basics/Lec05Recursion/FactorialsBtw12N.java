package Lec05Recursion;

import java.util.ArrayList;

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
