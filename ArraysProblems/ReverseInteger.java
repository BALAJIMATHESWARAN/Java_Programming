public class ReverseInteger {
    public static void main(String[] args) {
        int num = -1234;
        long sum = 0;
        while(num != 0){
            sum = sum*10 + num % 10;
            num /= 10;
        }

        if(sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE){
            return ;
        }
        System.out.println((int)sum);
    }
}
