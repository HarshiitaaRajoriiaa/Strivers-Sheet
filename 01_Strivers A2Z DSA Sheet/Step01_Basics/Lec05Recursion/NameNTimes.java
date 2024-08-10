package Lec05Recursion;
//https://www.geeksforgeeks.org/problems/print-gfg-n-times/1
public class NameNTimes {
    public static void main(String[] args) {
        printGfg(5);
    }
     public static void printGfg(int N) {
        // code here
        if(N<=0) return;
        System.out.print("GFG" + " ");
        printGfg(N-1);
        
    }
}
