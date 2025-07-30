public class CountHillsandValleysinanArray {
    public static void main(String [] args){
        int arr[] = {6,6,5,5,4,1};
        int left = 0 ;
        int count = 0;
        for(int i = 1 ; i < arr.length -1 ;i++){
            if(arr[i] != arr[i+1]){
                if((arr[i] > arr[left] && arr[i] > arr[i+1]) ||
                    arr[i] < arr[left] && arr[i] < arr[i+1]){
                        count++;
                    }
                left = i;
            }
        }
        System.out.println(count);
    }
}
