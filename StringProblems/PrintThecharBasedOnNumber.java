import java.util.*;
public class PrintThecharBasedOnNumber {
    public static void main(String[] args){
        String str = "b3c6d15";
        char s = '0';
        
        int j = 0;
        for(int i = 0 ; i < str.length() ; i++){
            int num = 0;
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                num = str.charAt(i)- '0' ;
                for( j = i+1 ;j < str.length();j++){
                    if(str.charAt(j) >= '0' && str.charAt(j) <= '9'){
                        num = num*10;
                        num+=str.charAt(j) - '0';
                    }
                    else{
                        break;
                    }
                    
                }
                for(int k = 0 ; k < num ; k++){
                    System.out.print(s);
                }
                i = j-1;
            }
            else{
                s = str.charAt(i);
            }
        }
    }
}
