package Lec05Recursion;
//https://www.geeksforgeeks.org/problems/print-gfg-n-times/1
public class NameNTimes {
    public static void main(String[] args) {
        printGfg(5);
        printGfg2(4 , 1);
    }

    // ! TC =0(N)
     public static void printGfg(int N) {
        // code here
        if(N<=0) return;
        System.out.print("GFG" + " ");
        printGfg(N-1);
        System.out.println();
        
    }
    
    //* striver code:
    // ! TC =0(N)
    public static void printGfg2(int N , int i) {
        if(i>N) return;
        System.out.print("GFG" + " ");
        printGfg2(N, i+1);
    }
}
