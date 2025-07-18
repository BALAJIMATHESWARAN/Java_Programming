public class BestTimeToBuySell {
    public static void main(String[] args){
        int arr[] = {7,1,5,3,6,4};
        int len = arr.length;
        int min = arr[0];
        int max = 0;
        int sum = 0;
        for(int i = 0 ;i < len ; i++){
            if(min > arr[i]) min = arr[i];
            sum = arr[i] - min;
            if(sum > max){
                max = sum;
            }
        }
        System.out.println(max);
    }
}
