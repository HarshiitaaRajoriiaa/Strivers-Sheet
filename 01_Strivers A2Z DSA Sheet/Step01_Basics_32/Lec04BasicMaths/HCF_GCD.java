package Lec04BasicMaths;
//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
public class HCF_GCD {
    static Long[] lcmAndGcd(Long A , Long B) {
        // code here
        Long longa[] = new Long[2];
        longa[0] = lcm(A, B);
        longa[1] = gcd(A,B);
        return longa;
        
    }
    public static Long gcd(Long a , Long b){
        while(b!=0){
            long temp = b;
            b=a%b;
            a=temp;
        }
        return a;
    }
    public static Long lcm(Long a ,Long b){
        return (a * b / gcd(a, b));
    }
}


//gcd(a,b) = gcd(a%b , b)
// gcd*lcm = (a*b)