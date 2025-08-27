public class StringToInteger{
    public static void main(String[] args) {
        String str = "   -0427c0";
        int len = str.length();
        int l = 0;
        int neg = 1;
        int res = 0;
        while(l < len && str.charAt(l) == ' '){
            l++;
        }
        if(l < len && (str.charAt(l) == '-') || (str.charAt(l) == '+')){
            neg = (str.charAt(l) == '-') ? -1 : 1;
            l++;
        }

        while(l < len &&  str.charAt(l) >= '0' && str.charAt(l) <= '9'){
            int digits = str.charAt(l) - '0';
            res = res * 10 + digits;
            l++;
        }
        System.out.println(res * neg);
    }
}