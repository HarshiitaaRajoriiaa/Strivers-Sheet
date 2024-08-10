package Lec05Recursion;
import java.util.ArrayList;
public class Factorials {
    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(factorialNumbers(3));
        
    }
    //? factorial of N
    public static long fact(long N){
            long fact = N;
            if(N==0){
                return 1;
            }
            fact = fact* fact(N-1);
            return fact;
        }
    //? return all numbers less than n whose factorial is less than n
    static ArrayList<Long> factorialNumbers(long n) {
        ArrayList<Long> sol = new ArrayList<>();
        for(int i = 1;i<n ;i++){
            if(fact(i) < n ){
                sol.add((long) i);
            }
        }
        return sol;
   }
}