import java.util.*;

public class ThreeSum {
    public static void main(String [] args){
        List<List<Integer>> ls = new ArrayList<>();
        int arr[]  = {-2,0,1,1,2};
        int target = 0;
        SelectionSort.Sort(arr);
        for(int i = 0 ; i < arr.length; i++){
            if(i > 0 && arr[i] == arr[i-1]) continue;
            int  j = i +1;
            int k = arr.length-1;
            while(j < k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum < target) j++;
                else if(sum > target) k--;
                else{
                    ArrayList<Integer> ls1 = new ArrayList<>();
                    ls1.add(arr[i]);
                    ls1.add(arr[j]);
                    ls1.add(arr[k]);
                    ls.add(ls1);
                    j++;
                    k--;
                    while(j < k && arr[j] == arr[j-1]) j++;
                    while(j < k && arr[k] == arr[k+1]) k--;
                }
                
            }
        }
        for(int i = 0 ;i < ls.size();i++)
        System.out.println(ls.get(i));
    }
}
