package Dynamic_Programming.Memization;
import java.util.*;
public class ClimbingStairs{

    public static int countAll(int n, int dp[]){
        if(n == 0 || n == 1) return 1;
        if(dp[n] != -1) return dp[n];
        else return dp[n] = countAll(n-1,dp) + countAll(n-2,dp);
    }

    public static void main(String [] args){
        int n = 45;
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(countAll(n,dp));
    }
}
