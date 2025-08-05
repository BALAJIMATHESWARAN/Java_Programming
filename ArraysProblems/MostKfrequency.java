import java.util.*;
public class MostKfrequency {
    public static void main(String[] args) {
        int arr [] = {1,1,1,2,2,3};
        int len = arr.length;
        int k = 2;
        Map<Integer,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            if(!hm.containsKey(arr[i])){
                hm.put(arr[i],1);
            }
            else{
                hm.put(arr[i], hm.get(arr[i])+1);
            }
        }
        System.out.println(hm.toString());

        for(int i : hm.keySet()){
            if(hm.get(i) >= k){
                System.out.println(i);
            }
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
            // Integer key = entry.getKey();
            if(entry.getValue() >= k){
                System.out.println(entry.getKey());
            }
        }

        Iterator<Map.Entry<Integer,Integer>> j  = hm.entrySet().iterator();
        while(j.hasNext()){
            System.err.println(j.next());
        }
    }
}
