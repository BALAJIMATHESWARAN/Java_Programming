public class BinaryToInteger {
    public static int tointeger(int num, int res, int pow){
        if(num == 0) return res;
        res = res + (num%10) * pow;
        pow *= 2;
        num/=10;
        return tointeger(num,res,pow);
    }
    public static void main(String[] args) {
        int num = 1010;
        // System.out.println("asdg");
        System.out.println(tointeger(num,0,1));
    }
}
