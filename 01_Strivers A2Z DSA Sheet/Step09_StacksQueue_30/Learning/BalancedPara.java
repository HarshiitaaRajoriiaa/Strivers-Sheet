package Step09_StacksQueue_30.Learning;
import java.util.Stack;
//?https://leetcode.com/problems/valid-parentheses/
public class BalancedPara {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        //stack should be empty at end of the loop,
        // push opening ones, and compare the closing ones when encountered with last element
        // s.length() %2 != 0 return false
        int l = s.length();
        if(l%2 != 0 ) return false;
        for(int i =0 ; i <l; i++){
            char it = s.charAt(i);
            if(it == '(' || it == '[' || it == '{') st.push(it);
            else{
                if(st.isEmpty()) return false;
                char ch = st.pop();
                //compare ( == ) , { == } , [ == ]
                // char it = s.charAt(i);
                if((it == ')' && ch == '(') ||  (it == ']' && ch == '[') || (it == '}' && ch == '{')) continue;
                else  return false;    
            }
        }
        return st.isEmpty();
    }
}
