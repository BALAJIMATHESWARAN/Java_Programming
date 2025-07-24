public class ValidPalindrome1 {

    public static char toLowerest(char ch){
        if(ch >= 'A' && ch <= 'Z'){
            ch = (char)(ch+32);
        }
        return ch;
    }
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        int l = 0;
        int r = str.length() - 1;
        int flag = 1;
        while( l < r){
            char start = toLowerest(str.charAt(l));
            char end  = toLowerest(str.charAt(r));

            if(!((start >= 'a' && start <= 'z') || (start >= '0' && start <= '9'))){
                l++;
                continue;
            }
            if(!((end >= 'a' && end <= 'z') || (end >= '0' && end <= '9'))){
                r--;
                continue;
            }

            if(start != end) {
                flag = 0;
                break;
            }
            else {
                l++;r--;
            }

        }
        if(flag == 1){
            System.out.println("It is a palindrome");
        }
        else {
            System.out.println("Not a palindrome");
        }
    }
}
