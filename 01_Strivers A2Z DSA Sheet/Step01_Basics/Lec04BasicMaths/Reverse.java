package Lec04BasicMaths;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x){
        int sol = 0 ; 
        int sign = x <0 ? -1:1;
        int X  = Math.abs(x);
        while(X!=0){
            int end = X%10;
            sol = sol*10 + end;
            X/=10;
        }
        return sol*sign;
    }
}
