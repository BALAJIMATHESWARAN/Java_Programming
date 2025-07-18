import java.util.*;
public class SetMatrixZero {
    public static void main(String[] args) {
        int matrix[][] = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int row = matrix.length;
        int col = matrix[0].length;
        int fcol = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0; j < col ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    if(j != 0){
                        matrix[0][j] = 0;
                    }
                    else fcol = 1; 
                }
            }
        }
        for(int  i = 1 ;i < row ;i++){
            for(int j = 1 ;j < col ; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }
        if(matrix[0][0] == 0){
            for(int i = 0 ; i < col ;i++){
                matrix[0][i] = 0;
            }
        }
        if(fcol == 1){
            for(int i = 0; i < row ;i++){
                matrix[i][0] = 0;
            }
        }
        for(int i = 0 ; i < row;i++){
            System.out.println(Arrays.toString(matrix[i]));
        }
    }

}
