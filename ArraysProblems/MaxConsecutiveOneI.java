public class MaxConsecutiveOneI {
    public static void main(String[] args) {
        int arr[] = {1,1,0,1,1,1,0,1,1};
        int len = arr.length;
        int l = 0;
        int count = 0;
        int maxLen = -1;
        while(l < len){
            if(arr[l] != 1){
                if(count > maxLen){
                    maxLen  = count;
                }
                count = 0;
            }
            else{
                count++;
            }
            l++;
        }
        System.err.println(maxLen);
    }
}
