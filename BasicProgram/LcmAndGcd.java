package BasicProgram;

public class LcmAndGcd {
    public static void main(String[] args){
       int a = 15;
        int b = 12;
        int GCD = 1;
        for(int i = 1 ; i <= a && i <= b ; i++){
            if(a % i == 0 && b % i == 0){
                 GCD = i;
            }
        }
        int LCM = (a * b) / GCD;
        System.out.println(LCM + "  "+ GCD);
    }
}   
