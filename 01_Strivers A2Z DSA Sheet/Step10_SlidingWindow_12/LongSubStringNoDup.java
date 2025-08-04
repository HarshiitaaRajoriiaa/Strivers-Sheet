import java.util.HashSet;
import java.util.Set;

public class LongSubStringNoDup {
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            Set<Character> set = new HashSet<>();
            int l = 0;
            int r = 0;
            int max = 0;
            while (r < s.length()) {
                if (set.contains(s.charAt(r))) {
                    while (s.charAt(l) != s.charAt(r)) {
                        set.remove(s.charAt(l));
                        l++;
                    }
                    l++;// when it recahes the index where duplication happening in example 1 where
                        // s.charAt(0)=a comes under conatins situtaion and l++ booom solves!!!.
                }
                set.add(s.charAt(r));
                max = Math.max(r - l + 1, max);
                r++;
            }
            return max;
        }
    }
}
