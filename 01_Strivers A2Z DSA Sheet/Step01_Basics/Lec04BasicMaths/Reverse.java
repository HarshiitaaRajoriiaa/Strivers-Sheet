package Lec04BasicMaths;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x){
        int sol = 0;
        while (x != 0) {
            int end = x % 10;
            x /= 10;
            if (sol > Integer.MAX_VALUE / 10 || (sol == Integer.MAX_VALUE / 10 && end > 7)) { //2147483647
                return 0;  // Integer overflow
            }
            if (sol < Integer.MIN_VALUE / 10 || (sol == Integer.MIN_VALUE / 10 && end < -8)) { //-2147483648
                return 0;  // Integer underflow
            }
            sol = sol * 10 + end;
        }
        return sol;
    }



    //HANDLING THE BIGGER INPUT:
}
