
//? https://leetcode.com/problems/string-to-integer-atoi/submissions/1663648090/
public class StringToInt {
    public int myAtoi(String s) {
        int l = s.length();
        if (l == 0)
            return 0;

        int i = 0;
        // Skip white spaces
        while (i < l && s.charAt(i) == ' ') {
            i++;
        }

        // Check sign
        boolean pos = true;
        if (i < l && s.charAt(i) == '-') {
            pos = false;
            i++;
        } else if (i < l && s.charAt(i) == '+') {
            i++;
        }

        // Parse number
        long ans = 0;
        while (i < l && Character.isDigit(s.charAt(i))) {
            ans = ans * 10 + (s.charAt(i) - '0');
            if (ans > Integer.MAX_VALUE)
                break; // early exit on overflow
            i++;
        }

        if (!pos)
            ans *= -1;

        // Clamp to integer bounds
        if (ans > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (ans < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) ans;
    }
}
