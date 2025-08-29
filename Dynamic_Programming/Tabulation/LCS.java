package Dynamic_Programming.Tabulation;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LCS {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "ace";
        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n+1][m+1];
        for(int i = 0 ; i <= n ; i++){
            dp[i][0] = 0;
        }
        for(int j = 0 ; j <= m ; j++){
            dp[0][j] = 0;
        }

        for(int i = 1 ; i <= n ; i++){
            for(int j = 1 ; j <= m ; j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n][m]);

        for(int i = 0 ; i <= n ; i++){
           System.out.println(Arrays.toString(dp[i]));
        }

        int len = dp[n][m];
        char ch[] = new char[len];
        int k = n;
        int l = m;
        while(k > 0 && l > 0){
            if(str1.charAt(k-1) == str2.charAt(l-1)){
                ch[--len] = str1.charAt(k-1);
                k--;
                l--;
            }
            else if(dp[k-1][l] > dp[k][l-1]){
                k--;
            }
            else{
                l--;
            }
        }
        System.out.println(Arrays.toString(ch));    
    }
    
}
