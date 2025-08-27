public class MergeSort{
    public static void main(String[] args) {
        int arr[] = {5,6,2,3,4,8,9,0};
        mergeSort(arr,0,arr.length-1);
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }

    public static void mergeSort(int arr[] , int l , int r){
        if(l < r){
            int mid = l + (r-l)/2 ;
            mergeSort(arr, l ,mid) ;
            mergeSort(arr, mid+1, r) ;
            merger(arr, l , mid, r) ;
        }
    }
    public static void merger(int arr[] , int l , int mid, int r){
        int s = l;
        int e = mid+1;
        int res[] = new int[r -l +1];
        int i = 0;
        while(s <= mid && e <= r){
            if(arr[s] <= arr[e]){
                res[i] = arr[s];
                i++;
                s++;
            }
            else {
                res[i] = arr[e];
                i++;
                e++;
            }
        }
        while(s <= mid) {
            res[i] = arr[s];
            i++;
            s++;
        }
        
        while(e <= r){
            res[i] = arr[e];
            i++;
            e++;
        }
        
        for(int j = l ; j <= r; j++ ){
            arr[j] = res[j-l];
        }
    }
}
    