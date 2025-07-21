public class SortZeroOneTwoInArray {
    public static void main(String[] args) {
        int arr[] = {};
        int len = arr.length;
        int left = 0;
        int  mid = 0;
        int right = len -1;
        while(mid <= right){
            if(arr[mid] == 0){
                int temp = arr[mid];
                arr[mid] = arr[left];
                arr[left] = temp;
                mid++;
                left++;
            }
            else if(arr[mid] == 1 ){
                mid++;
            }
            else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right--;
            }
        }
    }
}
