
//?https://leetcode.com/problems/word-ladder/
import java.util.*;

public class TwoOneSeven {
    // *Brute Force : for begin word's every alphabet we will run a loop till a to z
    // and check whether the changed word is in the list or not and if it's in the
    // list then, is it == end word or not;
    // *optimal approach using hashset and bfs
     class Pair{
        String wor;
        int counter;
        Pair(String wor, int counter){
            this.wor = wor;
            this.counter = counter;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        //using bfs
        Set<String> words = new HashSet<>();
        for(String word: wordList){
            words.add(word);
        }

        Queue<Pair> q = new LinkedList<>();
        // int counter = 1;
        q.add(new Pair (beginWord , 1));
        words.remove(beginWord);
        while(!q.isEmpty()){
            String w = q.peek().wor;
            int c = q.peek().counter;
            System.out.println(c);
            q.remove();
            if(w.equals(endWord)==true) return c;
            for(int i=0;i<w.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char array[]  = w.toCharArray();
                    array[i] = ch;
                    String newStr = new String(array);
                    if(words.contains(newStr)==true){
                        words.remove(newStr);
                        q.add(new Pair (newStr , c+1));
                    }
                }
            }

        }
        return 0;
    }
}
