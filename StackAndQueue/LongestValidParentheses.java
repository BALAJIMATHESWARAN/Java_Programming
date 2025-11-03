package StackAndQueue;
import java.util.*;
public class LongestValidParentheses {
    public static void main(String[] args) {
        String str = "()(()))";
    int maxlen = 0;
    int len = str.length();
    Stack<Integer> s = new Stack<>();
    s.push(-1);
    for(int i = 0 ; i < len ; i++){
        char ch = str.charAt(i);
        if(ch == '('){
            s.push(i);
        }
        else{
            s.pop();
            if(s.isEmpty()){
                s.push(i);
            }
            else{
                maxlen = Math.max(maxlen,i - s.peek());
            }
        }
        
    }
    System.out.println(maxlen);
    }
    
}
