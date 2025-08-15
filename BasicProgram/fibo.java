import java.util.Scanner;

public class fibo {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int fir = 0;
        int sec = 1;
        int num = sc.nextInt();
        for(int i = 0 ;i <= num ; i++){
            System.out.println(fir);
            int temp = fir;
            fir = sec;
            sec = temp+fir;
        }
    }
}
