public class MoveZerosAtEnd {
    public static void main(String[] args) {
        int arr[] = {2,3,0,2,0,4,6,0,0,0,4};
        int i = 0 ;
        int j = 0;
        while( j < arr.length){
            if(arr[j] != 0){
                arr[i] = arr[j];
                i++;
            }
            j++;
        }
        while( i < arr.length){
            arr[i] = 0;
            i++;
        }
        for(int k = 0 ; k < arr.length;k++){
            System.out.print(arr[k] + " ");
        }
    }
}
