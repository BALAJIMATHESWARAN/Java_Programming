public class IntegertoBinary {
    public static int toBinary(int num){
        if(num == 0) return 0;
        int res = 0;
        while(num != 0){
            res = res * 10 + num%2;
            num/=2;
        }
        int result = 0;

        while(res != 0){
            result = result * 10 + res%10;
            res/=10;
        }
        return result;
    }

    public static int toBinaryUsingRecrusion(int num, int res){
        if(num == 0) return res;
        res = res * 10 + num%2;
        return toBinaryUsingRecrusion(num/2, res);

    }

    public static void main(String [] args){
        int num = 13;
        System.out.println(toBinary(num));
        System.out.println(toBinaryUsingRecrusion(num,0));
    }
}
