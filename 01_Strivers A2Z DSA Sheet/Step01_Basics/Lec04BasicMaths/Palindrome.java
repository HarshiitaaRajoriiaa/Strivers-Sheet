package Lec04BasicMaths;
public class Palindrome{
    public static void main(String[] args) {
        System.out.println(checkPalindrome(1234321));
        
    }
    public static boolean checkPalindrome(int n ){
        String digit = String.valueOf(n);
        boolean result = true;
        for(int i = 0 ;  i < digit.length()/2 ; i++){
            if(digit.charAt(i) != digit.charAt(digit.length() - 1-i)){
                result = false;
                break;
            }
        }
        return result;
    }
}