
public class QuikSort {
    public static void main(String[] args){
        int arr[] = {2,8,5,4,7,9};
        quickSort(arr, 0, arr.length-1);
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print(arr[i] +" ");
        }
    }

    public static void quickSort(int arr[], int l, int r){
        if(l >= r) return ;
        int s = l;
        int e = r;
        int mid = s + (e-s)/2;
        int pivot = arr[mid];
        while(s <= e){
            while(arr[s] < pivot) s++;
            while(arr[e] > pivot) e--;
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
        }
        quickSort(arr, l, e);
        quickSort(arr, s, r);
    }
}
