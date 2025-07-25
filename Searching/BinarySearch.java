package Searching;
public class BinarySearch {
    public static void main(String [] args){
        int arr[] = {1,2,3,4,5,6,8,10};
        int target = 4;
        int l = 0;
        int r = arr.length-1;
        while(l <= r){
            int mid = l+(r-l)/2;
            if(arr[mid] == target){
                System.out.println(mid);
                break;
            }
            else if(arr[mid] > target) r = mid -1;
            else l = mid +1;
        }
    }
}
