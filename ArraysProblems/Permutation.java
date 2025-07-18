
import java.util.Arrays;

public class Permutation {
    public static void reverse(int arr[] , int l , int r){
        while(l <= r ){
            swap(arr,l,r);
            r--;
            l++;
        }
    }
    public static void swap(int arr[] , int l , int r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
    }
    public static void main(String[] args) {
        int arr[] = {2,1,5,4,3,0,0};
        int len = arr.length;
        int ind = -1;
        for(int i = len-2 ; i >= 0 ; i--){
            if(arr[i] < arr[i+1]){
                ind = i;
            }
        }
        if(ind == -1){
            reverse(arr,0,len-1);
        }
        else{
            for(int i = len -1; i >= 0 ; i--){
                if(arr[i] > arr[ind]){
                    swap(arr,i,ind);
                    break;
                }
            }
            reverse(arr, ind+1, len-1);
        }
        System.out.println(Arrays.toString(arr));
    }
}
