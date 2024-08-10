package Lec05Recursion;

//https://leetcode.com/problems/valid-palindrome/
public class Palindrome {
    public static void main(String[] args) {
        // System.out.println(isAlphanumeric(0));

    }

    // !without Recursions:
    public Boolean isAlphaNumeric(char c) {
        if (c >= '0' && c <= '9') {
            return true;
        } else if (c >= 'a' && c <= 'z') {
            return true;
        }
        return false;
    }

    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        StringBuilder str = new StringBuilder();
        s = s.toLowerCase();

        // getting all aphanumeric chars
        for (int i = 0; i < s.length(); i++) {
            if (isAlphaNumeric(s.charAt(i))) {
                str.append(s.charAt(i));
            }
        }

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    // TODO : with Recursion:
    public boolean isPalindrome2(String s) {
        return isPalindormeHelper(s ,0 ,s.length()-1);
   }

    public boolean isPalindormeHelper(String s, int i, int e) {
        if (i >= e) return true;
        while (i < e && !Character.isLetterOrDigit(s.charAt(i))) i++;
        while (i < e && !Character.isLetterOrDigit(s.charAt(e)))  e--;
        if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(e)))
            return false;
        return isPalindormeHelper(s, i + 1, e - 1);

    }

}
