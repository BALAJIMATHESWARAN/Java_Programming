import java.util.Scanner;

public class reverseNumberUsingRecrusion {
    public static int reverse(int num, int rev){
        if(num == 0) return rev;
        rev = rev * 10 + num%10 ;
        return reverse(num/10, rev);
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        System.out.println(reverse(num,0));
    }
}
