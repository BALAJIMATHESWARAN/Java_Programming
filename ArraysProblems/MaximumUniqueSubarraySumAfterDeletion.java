import java.util.*;
public class MaximumUniqueSubarraySumAfterDeletion {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int ans = maxSum(arr);
        System.err.println(ans);
    }

    public static int maxSum(int[] arr) {
        int len = arr.length;
        int max = Integer.MIN_VALUE;
        int count = 0;
        Set<Integer> s = new HashSet<>();

        for(int i = 0 ;i < len ; i++){
            if(arr[i] > 0){
                s.add(arr[i]);
                count++;
            }    
        }

        if(count == 0){
            
            for(int i = 0 ;i < len ; i++){
                if(max < arr[i])max= arr[i];
            }
        }
        else{
            max = 0;
            Iterator<Integer> i = s.iterator();
            while(i.hasNext()){
                max+= i.next();
            }
        }
        return max;
    }
}
