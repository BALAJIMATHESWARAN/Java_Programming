public class JumpGame2 {
    public static void main(String[] args) {
        int arr[] = {2,3,0,1,4};
        int l = 0;
        int r = 0;
        int max = 0;
        int jump = 0;
        while(r < arr.length-1){
            for(int i = l ; i <= r;i++ ){
                max = Math.max(i+arr[i], max);
            }
            l = r+1;
            r = max;
            jump++;
        }
        System.out.println(jump);
    }
}
