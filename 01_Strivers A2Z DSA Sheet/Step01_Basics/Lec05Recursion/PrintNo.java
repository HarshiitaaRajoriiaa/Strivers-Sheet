package Lec05Recursion;

public class PrintNo {
    public static void main(String[] args) {
        printNo(10);
        
    }
    public static void printNo(int N){
        if(N>0){
        printNo(N-1);
        System.out.print(N + " ");
        }
    }
}
