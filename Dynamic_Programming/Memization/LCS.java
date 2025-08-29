package Dynamic_Programming.Memization;
import java.util.*;
public class LCS {

    public static int lcs(String str1, String str2, int index1, int index2, int [][]dp){
        if(index1 < 0 || index2 < 0) return 0;
        if(dp[index1][index2] != -1) return dp[index1][index2];
        if(str1.charAt(index1) == str2.charAt(index2)) return dp[index1][index2] = 1+lcs(str1, str2, index1-1, index2-1, dp);
        else
            return dp[index1][index2] = Math.max(lcs(str1, str2, index1-1, index2, dp), lcs(str1, str2, index1, index2-1, dp));

    }
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "def";
        int n = str1.length();
        int m = str2.length();
        int dp [][] = new int[n][m];
        for(int rows[] : dp){
            Arrays.fill(rows,-1);
        }
        System.out.println(lcs(str1,str2,n-1,m-1,dp));

    }
}
