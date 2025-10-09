package StackAndQueue;
public class LongestValidParenteses {
    public static void main(String [] args){
        String str = "(()";
        int len = str.length();
        int open = 0;
        int close = 0;
        int max = 0;

        for(int i = 0 ;i < len ; i++){
            char ch = str.charAt(i) ;
            if(ch == '(' ){
                open++;
            }
            else{
                close++;
            }
            if(open == close){
                int tot = open+close;
                max = Math.max(max, tot);
            }
            else if(open < close){
                open = close = 0;
            }
        }

        open = close = 0;
        for(int i = len-1 ;i >= 0 ; i--){
            char ch = str.charAt(i) ;
            if(ch == '(' ){
                open++;
            }
            else{
                close++;
            }
            if(open == close){
                int tot = open+close;
                max = Math.max(max, tot);
            }
            else if(open > close){
                open = close = 0;
            }
        }
        System.out.println(max);
    }
}
