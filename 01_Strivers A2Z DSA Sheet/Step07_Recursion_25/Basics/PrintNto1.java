package Basics_Step01_Striver;
//https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/0
public class PrintNto1 {
    public static void main(String[] args) {
        
    }

    // *TC = 0(N)
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
}
