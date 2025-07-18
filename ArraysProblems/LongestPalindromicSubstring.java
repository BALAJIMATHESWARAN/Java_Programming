public class LongestPalindromicSubstring {
       public static void main(String[] args) {
            String s = "alaalaM";
            int len = s.length();
            int maxLen = 1;
            int start = 0 ;
            for(int i = 0 ; i < len ;i++){
                for(int j = 0 ; j <= 1; j++){
                    int left = i;
                    int right = i+j;
                    while(left >= 0 && right < len && s.charAt(left) == s.charAt(right)){
                        if((right - left +1) > maxLen){
                            start = left;
                            maxLen = right - left+1;
                        }
                        left--;
                        right++;
                    }
                }
            }
            // String s1 = "";
            for(int  i = start; i < start+maxLen ;i++){
                System.out.print(s.charAt(i));
            }
       }
}
