import java.nio.channels.SelectionKey;
import java.util.*;

public class FourSum {
    public static void main(String[] args){
        int arr[] = {1,0,-1,0,-2,2};
        int target = 0;
        SelectionSort.Sort(arr);
        List<List<Integer>> ls = new ArrayList<>();
        for(int i = 0 ; i < arr.length-1;i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            for(int j = i+1 ;  j < arr.length-1; j++){
                if(j > i+1 && arr[j] == arr[j-1]) continue;
                int k = j +1;
                int l = arr.length-1;
                while(k < l){
                    int sum = arr[i] + arr[j]+ arr[k] + arr[l];
                    if(sum < target) k++;
                    else if(sum > target) l--;
                    else{
                        ArrayList<Integer> ls1 = new ArrayList<>();
                        ls1.add(arr[i]);
                        ls1.add(arr[j]);
                        ls1.add(arr[k]);
                        ls1.add(arr[l]);
                        ls.add(ls1);
                        k++;
                        l--;
                        while(k < l && arr[k] == arr[k-1]) k++;
                        while(k < l && arr[l] == arr[l+1]) l--;
                    }
                }
            }
        }
        for(int i = 0 ; i < ls.size(); i++){
            System.out.println(ls.get(i));
        }
    }    
}
