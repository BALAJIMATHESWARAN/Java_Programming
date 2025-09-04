package Dynamic_Programming.Memization;
import java.util.Arrays;

public class HouseRobber1 {
    public static int maxMoney(int ind, int [] nums, int dp[]){
        if(ind == 0) return nums[ind];
        if(ind < 0) return 0;
        if(dp[ind] != -1) return dp[ind];
        int pick = nums[ind] + maxMoney(ind - 2 , nums,dp);
        int notPick = maxMoney(ind -1 , nums, dp);
        return dp[ind] = Math.max(pick, notPick);
    }
    public static void main(String[] args){
        int nums[] = {1,2,3,1};
        int len = nums.length;
        int dp[] = new int[len];
        Arrays.fill(dp,-1);
        System.out.println(maxMoney( len-1 , nums,dp));
    }
}
