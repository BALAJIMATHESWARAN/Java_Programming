import java.util.*;
public class ReverseWordInString {
    public static void main(String[] args){
        String str =" Hey, This is a  ball  ";
        StringBuilder sb = new StringBuilder();
        int len = str.length();
        int  i = len -1;
        while(i >= 0){
            while(i >= 0 &&  str.charAt(i) == ' ')i--;

            if(i < 0) break;
            int j = i;
            
            while(i >= 0 && str.charAt(i) != ' ')i--;
            
            
            if(sb.length() > 0) sb.append(" ");
            sb.append(str.substring(i+1, j+1));
        }
        System.out.println(sb.toString());
    }
}
