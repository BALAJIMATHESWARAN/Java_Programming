public class InsertionSort {
    public static void main(String args[]){
        int arr[] = {5,2,7,9,3,5,0,2,8};
        for(int i = 1; i < arr.length;i++){
            int j = i-1;
            int val = arr[i];
            while(j >= 0 && arr[j] > val){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = val;
        }
        for(int i = 0 ;i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
