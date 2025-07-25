public class JumpGame1 {
    public static void main(String[] args) {
        int arr[] = {3,2,1,1,4};
        int max = 0;
        for(int i = 0 ;i < arr.length;i++){
            if(i > max) {
                System.out.println("False");
                return ;
            }
            max = Math.max(i+arr[i], max);
        }
        System.out.println("True");
    }
}
