package StackAndQueue;
import java.util.*;
public class GenerateParentheses {

    static  List<String> res = new ArrayList<>();
    public static void generate(int ob, int cb, StringBuilder str, int n){
        if(str.length() == n * 2){
            res.add(str.toString());
            return ;
        }

        if(ob < n){
            str.append("(");
            generate(ob+1, cb, str, n);
            str.deleteCharAt(str.length()-1);
        }

        if(cb < ob){
            str.append(")");
            generate(ob, cb+1, str, n);
            str.deleteCharAt(str.length()-1);
        }

    }
   public static void main(String [] args){
        int n = 3;
        StringBuilder str = new StringBuilder();
        generate(0,0,str,n);
        System.out.println(res.toString());
   } 
}
