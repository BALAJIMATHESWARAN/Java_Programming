public class MaxConsecutiveOneIII {
    public static void main(String[] args) {
        int arr[] = {0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k = 3;
        int l = 0 ;
        int r = 0;
        int zero = 0;
        int maxLen = 0;
        int len = arr.length;
        while(r < len){
            if(arr[r] == 0){
                zero++;
            }
            if(zero <= k){
                maxLen = Math.max(maxLen,r-l+1);
            }
            if(zero > k){
                if(arr[l] == 0 )zero--;
                l++;
            }
            r++;
        }
        System.err.println(maxLen);
    }
}
