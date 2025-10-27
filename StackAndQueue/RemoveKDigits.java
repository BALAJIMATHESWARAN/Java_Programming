package StackAndQueue;
import java.util.*;
public class RemoveKDigits {
    public static void main(String[] args) {
        String str = "1432219";
        int k = 3;
        Stack<Character> s = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++){
            while(!s.isEmpty() && k > 0 && s.peek() > str.charAt(i)){
                s.pop();
                k--;
            }
            if(!s.isEmpty() || str.charAt(i) != '0'){
                s.push(str.charAt(i));
            }
        }

        while( !s.isEmpty() && k-- > 0){
            s.pop();
        }

        if(s.isEmpty())  return;

        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }
        System.out.print(sb.reverse().toString());
    }
}
