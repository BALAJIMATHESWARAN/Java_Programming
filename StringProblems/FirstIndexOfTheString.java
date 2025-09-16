public class FirstIndexOfTheString {
    public static void main(String [] args){
        String str1 = "sadbutsad";
        String str2 = "sad";
        int len1 = str1.length();
        int len2 = str2.length();
        for(int i = 0 ; i < len1-len2;i++){
            int j = 0 ; 
            while(j < len2 && str1.charAt(i+j) == str2.charAt(j)){
                j++;
            }
            if(j == len2) {
                System.out.println(i);
                return ;
            }
        }
        System.out.println("-1");
    }
}
