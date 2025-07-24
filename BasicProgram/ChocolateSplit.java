public class ChocolateSplit {
    public static void main(String[] args) {
        int choco = 21;
        int stud = 5;
        int count = 0;
        while(choco > 0){
            choco -= 8;
            if(choco >= 0){
                count++;
                if(choco == 4){
                    count--;
                    break;
                }
                
            }
                
            
            
        }
        System.out.println(count);
    }
}
