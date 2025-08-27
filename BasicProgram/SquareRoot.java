
public class SquareRoot {
    public static void main(String[] args) {
        int num = 225;
        int l = 1;
        int r = num/2;
        int res = -1;
        while(l <= r){
            int mid = l +(r-l) /2;
            if((long)mid*mid == num){
                res = mid;
                break;
            }
            else if((long)mid*mid < num){
                res = mid;
                 l = mid +1;
            }
            else{
                r = mid-1;
            }
        }
        System.out.println(res);
    }    
}
