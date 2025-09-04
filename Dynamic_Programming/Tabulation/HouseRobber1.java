package Dynamic_Programming.Tabulation;

public class HouseRobber1 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,1};
        int len = arr.length;
        int dp [] = new int[len];
        dp[0] = arr[0];
        int pick = 0;
        int notPick = 0;
        for(int i = 1 ; i < len ; i++){
            pick = arr[i];
            if(i > 1) pick+=dp[i-2];
            notPick = dp[i-1];
            dp[i] = Math.max(pick,notPick);
        }
        System.out.println(dp[len-1]);
    }
}
