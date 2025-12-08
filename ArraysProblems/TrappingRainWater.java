
public class TrappingRainWater {
    public static void main(String[] args){
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};
        int l = 0 ;
        int r = arr.length-1;
        int lm = 0 ; 
        int rm = 0;
        int Water = 0;
        while( l < r){
            if(arr[l] < arr[r]){
                if(lm < arr[l]){
                    lm = arr[l];
                    l++;
                }
                else {
                    Water+= lm - arr[l];
                    l++;
                }
            }
            else{
                if(rm < arr[r]){
                    rm = arr[r];
                    r--;
                }
                else{
                    Water+= rm - arr[r];
                    r--;
                }
            }
        }
        System.out.println(Water);
    }
}
