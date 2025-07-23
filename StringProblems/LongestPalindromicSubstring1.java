public class LongestPalindromicSubstring1 {

    public static boolean palidrome(String str, int i , int j){

        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "malayam";
        int len = str.length();
        int maxlen = 1;
        int start = -1;
        for(int i = 0 ; i < len; i++){

            for(int j = i; j < len; j++){
                if(palidrome(str,i,j) && (j - i + 1) > maxlen){
                    start = i;
                    maxlen = j - i +1;
                }
            }
        }
        for(int k = start ; k < start+maxlen ; k++){
            System.out.print(str.charAt(k));
        }
    }
}
