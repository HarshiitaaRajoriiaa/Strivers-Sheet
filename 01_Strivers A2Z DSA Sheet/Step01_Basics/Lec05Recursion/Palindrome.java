package Lec05Recursion;

public class Palindrome {
    public static void main(String[] args) {
        // System.out.println(isAlphanumeric(0));
        
    }
    public static  boolean isAlphanumeric(char c){
        boolean result = true;
        String string = String.valueOf(c);
        String string2 = string.replaceAll("[a-zA-Z0-9]" , "").toLowerCase();
        for(int i = 0 ; i < string2.length()/2 ; i++){
            if(string2.charAt(i) != string2.charAt(string2.length() - 1-i)){
                result = false;
                break;
            }
        } 
        return result;   
    }
}
