package Step01_Basics.Lec03JavaCollectionFramework;

public class Reversed {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        
    }
    public  static int reverse(int x) {
        int length = String.valueOf(x).length();
        int mul = length -1;
        int sol = 0;
       for(int i = 1 ;  i<=length ; i++){
            int pop = x%10;
            sol = pop*mul;
            x/=10;
            mul--;
       }
       return sol;
    }
}
