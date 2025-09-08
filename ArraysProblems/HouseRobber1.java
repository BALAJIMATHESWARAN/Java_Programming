public class HouseRobber1 {
    public static void main(String[] args){
        int arr[] = {1,2,3,1};
        int len = arr.length;
        int prev = arr[0];
        int prev2 = 0;
        for(int i = 1 ;i < len; i++){
            int take = arr[i];
            if(i > 1) take += prev2;
            int notTake = prev;
            int curr = Math.max(take, notTake);
            prev2 = prev;
            prev = curr;
        }
        System.out.print(prev);
    }
}
