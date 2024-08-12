package Lec04BasicMaths;
//https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
public class LCM_GCD {
    public static void main(String[] args) {
        System.out.println(lcm_gcd((long)5, (long)10));
        
    }
    public static Long[] lcm_gcd(Long A , Long B){
        Long gcd = (long)0 ; 
        Long sol[] = new Long[2];
        for(Long i = (long) 1; i<=Math.min(A, B) ; i++){
            if(A%i == 0 && B %i ==0){
                gcd =i;
            }
        }
        Long lcm = (A*B) / gcd;
        sol[1] = gcd;
        sol[0] = lcm;
        return sol;
    }
}
