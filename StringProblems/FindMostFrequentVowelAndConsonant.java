import java.util.*;
public class FindMostFrequentVowelAndConsonant {
    public static void main(String[] args){
        String str = "aeiaeia";
        int len = str.length();
        int maxVow  = 0;
        int maxCon = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0 ; i < len ; i++){
            hm.put(str.charAt(i),hm.getOrDefault(str.charAt(i),0)+1);
        }

        for(Map.Entry<Character,Integer> en : hm.entrySet()){
            if(en.getKey() == 'a' || en.getKey() == 'e' || en.getKey() == 'i' || en.getKey() == 'o' || en.getKey() == 'u'){
                if(en.getValue() > maxVow) maxVow = en.getValue();
            }
            else{
                if(en.getValue() > maxCon) maxCon = en.getValue();
            }
        }
        System.out.println(maxVow + maxCon);
    }
}
