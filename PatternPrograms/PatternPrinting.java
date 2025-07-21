public class PatternPrinting {
    public static void main(String[] args){
        int len = 10;
        int num = 1;
        for(int i = 1 ;i <= len ;i++){
            for(int j = 1 ; j <= i ; j++){
                if(i % 2 == 1 && j % 2 == 1 ) num = 0;
                else if(num == 1) num = 0;
                else num = 1;
                System.out.print(num +" ");
            }
            System.out.println();
        }
    }
}
