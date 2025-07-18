import java.util.HashMap;
public class TwoSum {
    public static void main(String[] args) {
        int arr[] = {5,2,8,5,6,4};
        int target = 14;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int sum = 0;
        for(int i = 0 ; i < arr.length;i++){
            sum = target - arr[i];
            if(hm.containsKey(sum)){
                System.out.print(hm.get(sum)+" "+ i);
            }
            else{
                hm.put(arr[i],i);
            }

        }
    }
}
