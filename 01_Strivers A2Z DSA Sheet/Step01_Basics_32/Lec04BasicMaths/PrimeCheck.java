package Lec04BasicMaths;
//https://www.naukri.com/code360/problems/check-prime_624934
public class PrimeCheck {
    public static void main(String[] args) {
        
    }
    public static String isPrime(int num) {
        if (num <= 1) return "NO";
        for (int i = 2; i <= (int)Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "NO"; 
            }
        }
        return "YES"; 
        }

}
