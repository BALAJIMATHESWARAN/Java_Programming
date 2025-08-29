
public class PascalTraingle {

    public static void pascalTraingle(int row){
         for(int i = 1 ; i <= row ; i++){
            System.out.print("1 ");
            int ans = 1;
            for(int j = 1 ; j < i ; j++){
                ans = (ans * (i - j)) / j;
                System.out.print(ans+" ");
            }
            System.out.println();
        }
    }

    public static void pascalTraingle(int row, int col){

        int ans = 1;
        for(int i = 0 ;i < col; i++){
            ans = ( ans * (row - i))/ (i+1);
        }
        System.out.println(ans);
    }

    public static void pascalTrainglePart(int row){
        int ans = 1;
        System.out.print("1 ");
        for(int j = 1 ; j < row ; j++){
                ans = (ans * (row - j)) / j;
                System.out.print(ans+" ");
            }
    }

    public static void main(String [] args){
        int row = 5;
        int col = 3;

        pascalTraingle(row);
        pascalTraingle(row-1,col-1 );
        pascalTrainglePart(row);
       
    }   
}
