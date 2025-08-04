
import java.util.Arrays;

public class LongestSubstringWithoutNotRepeatingCharacters {
    public static void main(String [] args){
        String str = "abcdesssasdavwqt";
        int len = str.length();
        int hash[] = new int[255];
        Arrays.fill(hash,-1);
        int l = 0 ;
        int r = 0;
        int maxlen = 0;

        while(r < len){
            if(hash[str.charAt(r)] != -1){
                if(hash[str.charAt(r)]  >= l){
                    l = hash[str.charAt(r)] + 1;
                }
            }
            hash[str.charAt(r)] = r;
            maxlen = Math.max(maxlen,r-l+1);
            r++;
        }
        System.out.println(maxlen);
    }
}
