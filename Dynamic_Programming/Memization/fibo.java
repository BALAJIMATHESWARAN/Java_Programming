package Dynamic_Programming.Memization;
import java.util.*;
public class fibo {

    public static int fiboNumber(int n, int dp[]){

        if(n == 0) return 0;
        if(n == 1) return 1;
        if(dp[n] != -1) return dp[n] ;
        return dp[n] = (fiboNumber(n-1, dp) + fiboNumber(n-2, dp));
    }
    public static void main(String [] args){
        int n = 10;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        for(int i = 0 ;i < n ; i++)
        System.out.println(fiboNumber(i,dp));
    }
}
