class BubbleSort{
    // hi
    public static void main(String [] args){
        int arr[]= {10,5,5,6,4,3,7,1,0};
        for(int i = 0 ; i < arr.length-1;i++){
            boolean swap = false;
            for(int j = 0 ;j < arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap = true;
                }
            }
            if(!swap){
                break;
            }
        }
        for(int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}