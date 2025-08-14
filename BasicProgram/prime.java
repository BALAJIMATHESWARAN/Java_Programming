import java.util.*;
public class prime {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int flag = 0;
        for(int i = 2 ;i <= Math.sqrt(num);i++){
            if(num % i == 0){
                flag = 1;
                break;
            }
        }
        if(flag == 0){
            System.out.println("It is a prime" + num);
        }
        else{
            System.out.println("It is not a prime" + num);
        }
    }
}
