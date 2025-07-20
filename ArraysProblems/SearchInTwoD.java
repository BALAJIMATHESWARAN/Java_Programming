public class SearchInTwoD {
    public static void main(String[] args) {
        int arr[][] = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 11;
        int r = arr.length;
        int c = arr[0].length;
        int l = 0;
        int h = r*c -1;
        while(l <= h){
            int mid = l +(h -l) /2;
            int val = arr[mid/c][mid%c];
            if(val == target) {
                System.out.println(mid);
                break;
            }
            else if(val > target) h = mid-1;
            else l = mid +1;
        }
    }
}
