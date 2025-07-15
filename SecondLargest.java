public class SecondLargest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,45,6,8,5,555,7};
        int len = arr.length;
        int firstLargest = 0;
        int secondLargest = 0;
        for(int i = 0 ;i < len ; i++){
            if(arr[i] > firstLargest){
                secondLargest = firstLargest;
                firstLargest = arr[i];
            }
            else if (arr[i] > secondLargest && arr[i] < firstLargest){
                secondLargest = arr[i];
            }
        }
        System.out.println(secondLargest);
    }
}
