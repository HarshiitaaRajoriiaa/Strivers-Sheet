//? 
import java.util.*;
public class three {
    public int lengthOfLongestSubstring(String s) {
        //*optimal = hashmap | index storing | two pointers */
        HashMap<Character, Integer> map = new HashMap<>();
        int l = 0, r = 0, max = 0;
        int n = s.length();

        while (r < n) {
            char c = s.charAt(r);
            // If duplicate found, jump left pointer after previous occurrence
            if (map.containsKey(c)) {
                l = Math.max(l, map.get(c) + 1);
            }
            map.put(c, r);
            max = Math.max(max, r - l + 1);
            r++;
        }
 
        return max;
    }
}
