import java.util.*;
public class CapacitySum {
    public static void main(String [] args){
        int arr[] = {1,2,3,10,5};
        int val = 10;
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int j = 0;
        for(int i = 0 ; i < arr.length;i++){
            ArrayList<Integer> l = new ArrayList<>();
            int sum = 0;
            for( j = i ; j < arr.length ; j++ ){
                sum += arr[j];
                if(sum <= val) l.add(arr[j]);
                else  break;
            }
            i = j-1;
            ls.add(l);
        }

        for(int i = 0 ; i < ls.size();i++){
            System.out.println(ls.get(i));
        }
    }
}
