
public class MinRotatedSortArray {
    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        int l = 0 ; 
        int r = arr.length-1;
        int res = -1;
        int min = Integer.MAX_VALUE;
        while(l <= r){
            int mid =  l+(r-l)/2;
            if(arr[l] < arr[r]) {
                res = mid;
                min = Math.min(min,arr[l]);
                break;
            }
            else if(arr[l] <= arr[mid]){
                res = l;
                min = Math.min(min,arr[l]);
                l = mid +1;
            }
            else {
                res = mid;
                min = Math.min(min,arr[mid]);
                r = mid -1;
            }
        }
        System.out.println("Rotation : " + res +"  \n" + "Min value : " + min );
    }    
}
