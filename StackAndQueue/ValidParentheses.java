package StackAndQueue;
import java.util.*;

public class ValidParentheses {
    public static void main(String[] args){
        String str = "{]()}";
        int len = str.length();
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < len ; i++){
            char ch = str.charAt(i);
            if(ch == '{' || ch == '[' || ch == '('){
                s.push(ch);
            }
            else if(ch == '}' || ch == ']' || ch == ')'){
                char c = s.pop();
                if((ch == '}' && c != '{')  || (ch == ']'  && c != '[') || ( ch == ')' && c != '(')){
                    return ;
                }
            }
        }
        System.out.println(s.isEmpty());
    }
}
