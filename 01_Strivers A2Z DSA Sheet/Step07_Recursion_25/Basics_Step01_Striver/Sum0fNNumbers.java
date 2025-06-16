package Basics_Step01_Striver;

public class Sum0fNNumbers {
    public static void main(String[] args) {
        System.out.println(sumN(4));
    }
    public static int sumN(int n){
        if(n==0) return 0;
        return n+sumN(n-1);
    }
}
