import java.util.ArrayList;
import java.util.List;

public class GroupAnagram {
    public static boolean isAnagram(String str1 , String str2){
        if(str1.length() != str2.length()) return false;
        int freq [] = new int[256];
        for(int i = 0 ; i < str1.length();i++){
            freq[str1.charAt(i)]++;
            freq[str2.charAt(i)]--;
        }

        for(int i = 0 ;i < str1.length();i++){
            if(freq[str1.charAt(i)] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String arr[] = {"eat","tea","tan","ate","nat","bat"};
        int len = arr.length;
        boolean bool[] = new boolean[len];
        List<List<String>> ls = new ArrayList<>();
        for(int i = 0 ;i < len ;i++){
            if(!bool[i]){
                ArrayList<String> ls1 = new ArrayList<>();
                ls1.add(arr[i]);
                bool[i] = true;
                for(int j = i+1; j < len ; j++){
                    if(!bool[j] && isAnagram(arr[i],arr[j])){
                        ls1.add(arr[j]);
                        bool[j] = true;
                    }
                }
                ls.add(ls1);
            }
        }
        for(int i = 0 ; i < ls.size() ; i++){
            System.out.println(ls.get(i));
        }
    }
}

// import java.util.*;

// class Solution {
//     public List<List<String>> groupAnagrams(String[] strs) {
//         Map<String, List<String>> map = new HashMap<>();

//         for (String s : strs) {
//             int[] count = new int[26];  // Assuming lowercase a-z only
//             for (char c : s.toCharArray()) {
//                 count[c - 'a']++;
//             }

//             // Convert count array to string key like: "1#0#0#0#1#..."
//             StringBuilder keyBuilder = new StringBuilder();
//             for (int num : count) {
//                 keyBuilder.append(num).append('#'); // '#' to separate counts
//             }
//             String key = keyBuilder.toString();

//             if (!map.containsKey(key)) {
//                 map.put(key, new ArrayList<>());
//             }
//             map.get(key).add(s);
//         }

//         return new ArrayList<>(map.values());
//     }

//     public static void main(String[] args) {
//         Solution sol = new Solution();
//         String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
//         List<List<String>> result = sol.groupAnagrams(input);

//         for (List<String> group : result) {
//             System.out.println(group);
//         }
//     }
// }

