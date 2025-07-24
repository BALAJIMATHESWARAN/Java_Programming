public class validPalindrome2 {
    public static boolean isPalindrome(String s , int l , int r){
        while(l < r){
            if(s.charAt(l) != s.charAt(r)) return false;
            l++;r--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        int l = 0 ;
        int r = str.length()-1;
        boolean val  = false;
        while(l < r){
            if(str.charAt(l) == str.charAt(r)){
                l++;
                r--;
            }
            else{
                val =  isPalindrome(str, l+1, r) || isPalindrome(str, l, r-1);
                break;
            }
        }

        if(val) System.out.println("It is a palindrome");

        else{
            System.out.println("It is not a palindrome");
        }
    }
}
