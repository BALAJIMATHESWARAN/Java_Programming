
public class RemoveDublicateInSorted {
    public static void main(String[] args){
        int arr[] = {0,0,1,1,1,2,6,6,6};
        int len = arr.length;
        int i = 0;
        int j = 0;
        while( j < len){
            if(arr[i] != arr[j]){
                i++;
                arr[i] = arr[j];
            }
            j++;
        }
        arr[i]  = arr[len-1];
        for(int k = 0 ;k <= i ;k++ )
        System.out.println(arr[k] +" ");
    }    
}
