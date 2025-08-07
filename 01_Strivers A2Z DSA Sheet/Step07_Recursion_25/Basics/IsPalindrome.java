package Basics_Step01_Striver;

//?https://www.geeksforgeeks.org/problems/palindrome-string0817/1
public class IsPalindrome {
  public static void main(String[] args) {
  }

  public int isPalindrome(String s) {
    return isPalindromeHelper(s, 0, s.length() - 1);
  }

  private static int isPalindromeHelper(String s, int start, int end) {
    if (start >= end) { // Base case: single character or empty string (palindrome)
      return 1;
    }
    if (s.charAt(start) != s.charAt(end)) { // Not a palindrome
      return 0;
    }
    return isPalindromeHelper(s, start + 1, end - 1); // Recursively check remaining substring
  }




//?https://leetcode.com/problems/valid-palindrome/
  public boolean isPalindromeLeetcode(String s) {
        if (s.length() == 0) return true;
        // convert to lowercase
        s = s.toLowerCase();
        // remove non-alphanumeric characters
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(c);
            }
        }
        String s_cleaned = sb.toString();
        // pass into recursive function
        return check(s_cleaned, 0, s_cleaned.length() - 1);
    }


    public boolean check(String s, int left, int right) {
        if (left >= right) return true; // equal to = odd string , > even string 
        if (s.charAt(left) != s.charAt(right)) return false;
        return check(s, left + 1, right - 1);
    }
}
