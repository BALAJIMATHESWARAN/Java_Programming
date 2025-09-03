package Dynamic_Programming.Tabulation;
import java.util.*;
public class fibo {
    public static void main(String[] args) {
        int n = 20;
        int dp[] = new int[20];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2 ; i  < n ; i++){
            dp[i] = dp[i-1]+dp[i-2];
            System.out.println(dp[i]);
        }
    }
}
