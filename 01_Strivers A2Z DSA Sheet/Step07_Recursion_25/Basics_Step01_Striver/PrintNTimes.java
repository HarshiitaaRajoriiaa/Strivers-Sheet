package Basics_Step01_Striver;
public class PrintNTimes{
    public static void main(String[] args) {
        printN("harshita Rajoria", 5);
    }
    public  static void printN(String abc , int n){
        if(n==0) return;
        System.out.println((abc));
        printN(abc, n-1);
    }
}