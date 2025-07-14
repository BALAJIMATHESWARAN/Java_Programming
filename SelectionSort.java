public class SelectionSort {
    public static void main(String[] args) {
        int arr[] = {10,5,2,3,5,7,0,9};
        Sort(arr);
    }

    public static void Sort(int arr[]){
        for(int i = 0 ; i < arr.length;i++){
            int min = i;
            for(int j = i+1 ; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        for(int i = 0 ;i < arr.length;i++){
            System.err.print(arr[i] +" ");
        }
    }
}
