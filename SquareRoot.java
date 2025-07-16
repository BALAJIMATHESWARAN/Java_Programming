
public class SquareRoot {
    public static void main(String[] args) {
        int num = 225;
        int l = 1;
        int r = num/2;
        int res = -1;
        while(l <= r){
            int mid = l +(r-l) /2;
            if(mid*mid <= num){
                res = mid;
            }
            if(mid*mid > num){
                r = mid -1;
            }
            else{
                l = mid+1;
            }
        }
        System.out.println(res);
    }    
}
