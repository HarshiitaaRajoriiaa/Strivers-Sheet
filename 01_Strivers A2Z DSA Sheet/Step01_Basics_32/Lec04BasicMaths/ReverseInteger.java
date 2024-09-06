package Lec04BasicMaths;
//https://leetcode.com/problems/reverse-integer/description/
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
    public static int reverse(int x){
        int sol = 0;
        while (x != 0) {
            int end = x % 10;
            x /= 10;
            if (sol > Integer.MAX_VALUE / 10 || (sol == Integer.MAX_VALUE / 10 && end > 7)) { 
                return 0;  // Integer overflow
            }
            if (sol < Integer.MIN_VALUE / 10 || (sol == Integer.MIN_VALUE / 10 && end < -8)) { //-2147483648
                return 0;  // Integer underflow
            }
            sol = sol * 10 + end;
        }
        return sol;
    }
}

//The biggest positive Integer is 2147483647 (let’s call it the “Big Max”).
//The smallest negative Integer is -2147483648 (the “Big Min”).
