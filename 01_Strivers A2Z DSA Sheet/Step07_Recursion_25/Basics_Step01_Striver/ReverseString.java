package Basics_Step01_Striver;
public class ReverseString {
//?https://leetcode.com/problems/reverse-string/description/
    public static void main(String[] args) {
        
    }
    public void reverseString(char[] s) {
        helper(s, 0, s.length - 1);
    }
    private void helper(char[] s, int start, int end) {
        if (start > end) {
            return; // Base case: single character or empty string
        }
        // Swap the first and last characters
        char temp = s[start];
        s[start] = s[end];
        s[end] = temp;

        // Recursively reverse the remaining sub array
        helper(s, start + 1, end - 1);
    }
}
