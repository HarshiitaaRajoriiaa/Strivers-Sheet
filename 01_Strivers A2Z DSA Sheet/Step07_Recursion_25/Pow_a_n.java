package Hold;
public class Pow_a_n {
    //?https://leetcode.com/problems/powx-n/
    public static void main(String[] args) {  
              
    }
    public double myPowHelper(double a, int b) {
        if(b==0) return 1.00;
        double half = myPowHelper( a , b/2);
        if(b%2==0) return half*half;
        else return a*half*half;
    }
    public double myPow(double a, int b) {
        if(b<0) return 1/myPowHelper( a , Math.abs(b) );
        else return myPowHelper(a,b);
    }


    //*without negative powers
    public static int pow(int x, int n){
        if(n==0) return 1;
        if(n%2==0) return pow(x,n/2)*pow(x,n/2);
        else return x*pow(x,n/2)*pow(x,n/2);
    }
}





