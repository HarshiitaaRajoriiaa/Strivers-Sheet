package Lec05Recursion;
//https://www.geeksforgeeks.org/problems/sum-of-first-n-terms5843/1
public class SumOfNTerms {
    public static void main(String[] args) {
        System.out.println(sumOfNTerms(5));
    }
    public static long sumOfNTerms(int N){
        int sum = 0 ;
        if(N<=0){
            return 0 ; 
        }
        sum += N*N*N;
        return sum+sumOfNTerms(N-1);
    }
}
