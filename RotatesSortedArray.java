public class RotatesSortedArray {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 3;
        int len = arr.length;
        int l = 0;
        int r = len-1;
        int res = -1;
        while(l <= r){
            int mid = l + (r-l)/2;
            if(arr[mid] == target) {
                res = mid;
                break;
            }
            else if(arr[l] <= arr[mid]){
                if(arr[mid] > target && arr[l] <= target){
                    r = mid -1;
                }
                else l = mid+1;
            }
            else{
                if(arr[mid] <  target && arr[r] <= target){
                    l = mid +1;
                }
                else r = mid -1;
            }
        }
        System.out.print(res);
    }
}
