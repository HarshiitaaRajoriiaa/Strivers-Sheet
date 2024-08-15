package Lec05Recursion;
public class PrintNo {
    public static void main(String[] args) {
        printNo(10);
        
    }

// ? https://www.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1
    // ! TC = 0(N)
    public static void printNo(int N){
        if(N>0){
        printNo(N-1);
        System.out.print(N + " ");
        }
    }

    // ! TC = 0(N)
    //? https://www.geeksforgeeks.org/problems/print-n-to-1-without-loop/1
    void printNos(int N) {
        
        // code here
        if(N==0){
            System.out.print("");
        }
       else{
            System.out.print(N +" ");
            printNos(N-1);
        }
    }
}
