package Lec04BasicMaths;
import java.util.ArrayList;
import java.util.List;
//https://www.naukri.com/code360/problems/sum-of-all-divisors_8360720?leftPanelTabValue=SUBMISSION
public class PrintAllDivisors {
    // *TC = 0(N*sqrt(N)
    public static int sumOfAllDivisors(int n){
        // Write your code here.
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=sumOfDivisors(i);
        }
        return sum;
    }
    public static int sumOfDivisors(int N){
        int sum=0;
        for(int i=1;i<=(int)Math.sqrt(N);i++){
            if(N%i==0) {
                sum+=i;
                if(i!=N/i) sum+=N/i;
            }
        }
        return sum;
    }

    // *in here first we are reducing the n(iterations) and then left number beyond Sqrt(n) we will access them by "if(i!=N/i) sum+=N/i;" this approach.
    // let's have example of 16 = loop will go till 4  = 1 ,2 , 4 will be  result of this if(N%i==0) and further 8 an 16 will be get by  2 ::  16/2 , 1 :: 16/1 , but 4 :: 16/4 won't be considered.







    //*Tc: 0(n)
    //https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1
    static long sumOfDivisorsGFG(int N) {
        long sum = 0;

         for (int i = 1; i <= N; i++) {
        // i is a divisor for every number it divides (like 2 is a divisor of 2, 4, 6, ...)
             sum += (N / i) * i;
         }
        return sum;
       }
}
