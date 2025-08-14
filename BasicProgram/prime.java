import java.util.*;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if (num < 2) {
            System.out.println(num + " is not a prime");
            return;
        }

        boolean isPrime = true;
        int limit = (int) Math.sqrt(num);
        
        for (int i = 2; i <= limit; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime");
        } else {
            System.out.println(num + " is not a prime");
        }
    }
}
