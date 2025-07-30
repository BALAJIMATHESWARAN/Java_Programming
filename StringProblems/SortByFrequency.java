import java.util.*;
public class SortByFrequency {
    public static void main(String[] args) {
        String str = "aaccaavvvvmmmm";
        int len = str.length();
        int freq[] = new int[256];
        for(int i = 0 ;i < len ; i++){
            freq[str.charAt(i)]++;
        }
        StringBuilder sb = new StringBuilder();
        while(true){
            int max = 0;
            char ch = '0';
            for(int i = 0 ;i < 256; i++){
                if(max < freq[i]){
                    max = freq[i];
                    ch = (char)i;
                }
            }
            if(max == 0) break;
            for(int i = 0; i < max ;i++){
                sb.append(ch);
            }
            freq[ch] = 0;
        }
        System.out.println(sb.toString());
    }
}
