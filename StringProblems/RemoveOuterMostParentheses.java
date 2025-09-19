import java.util.*;
public class RemoveOuterMostParentheses {
    public static void main(String [] args){
        StringBuilder sb = new StringBuilder();
        String str = "(()()(()))";
        int len = str.length();
        int balance = 0;
        for(int i = 0 ; i < len ; i++){
            char ch = str.charAt(i);
            if(ch == '('){
                if(balance > 0){
                    sb.append(ch);
                }
                balance++;
            }
            else{
                balance--;
                if(balance > 0){
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb.toString());
    }
}
