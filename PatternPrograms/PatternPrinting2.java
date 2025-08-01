public class PatternPrinting2 {
    public static void main(String[] args){
        String str = "greeksforgreeks";
        int len = str.length();
        for(int i = 0; i < len ; i++){
            for(int j = 0 ; j < len ; j++){
                if(i == j){
                    System.out.print(str.charAt(i));
                }
                else if(len - i-1 == j){
                    System.out.print(str.charAt(j));
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
