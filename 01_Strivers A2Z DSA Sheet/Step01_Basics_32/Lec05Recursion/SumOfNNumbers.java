package Lec05Recursion;
//? https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
public class SumOfNNumbers {
    public static void main(String[] args) {
    }
    // ! TC = 0 ( N)
    // functional way 
    public long sumOfSeries(long n) {
        if(n<=0) return 0;
        return (n*n*n) + sumOfSeries(n-1); //waits every time for function to return something and then execute further.
    }


    // ! TC = 0 ( N)
    // Parametrized way of calculating
    public static  void sumOfNTerms(int N , int sum) {
        if(N<=0) {
            System.out.println(sum);
            return;
        }
        sumOfNTerms(N-1 , sum+N);
    }
}
