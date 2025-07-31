import java.util.*;
public class LargestOddNumber {
    public static void main(String[] args) {
        String str = "2345678";
        int len = str.length();
        int i = len -1;
        while( i >= 0){
            int ch = str.charAt(i);
            if(ch % 2 == 1) {
                str = str.substring(0,i+1);
                break;
            }
            i--;
        }   
        System.out.println(str);
    }
}
