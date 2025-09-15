public class MaximumWordCanType {
    public static void main(String[] args) {
        String text = "hello world";
        String brokenWords = "ad";
        int count = 0;
        boolean wordBroken = false;
        boolean bool[] = new boolean[26];
        for(char ch : brokenWords.toCharArray()) bool[ch-'a'] = true;

        for(int i = 0 ; i < text.length() ; i++){
            char ch = text.charAt(i);
            if(ch == ' '){
                if(!wordBroken) ++count;
                wordBroken = false;
            }
            else{
                if( !wordBroken && bool[ch-'a']) wordBroken = true;
            }
        }
        if(!wordBroken)++count;

        System.out.println(count);
    }
}
