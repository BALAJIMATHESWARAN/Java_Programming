import java.util.*;
public class SortVowelsinaString {
    public static void main(String [] args){
        String str = "lEetcOde";
        int len = str.length();
        Set<Character> vowelSet = Set.of('A','E','I','O','U','a','e','i','o','u');
        ArrayList<Character> vowels = new ArrayList<>();

        for(int i = 0 ;i < len; i++){
            if(vowelSet.contains(str.charAt(i))){
                vowels.add(str.charAt(i));
            }
        }

        Collections.sort(vowels);

        StringBuilder s = new StringBuilder();
        int index = 0;

        for(int i = 0 ; i < len; i++){
            if(vowelSet.contains(str.charAt(i))){
                s.append(vowels.get(index++));
            }
            else s.append(str.charAt(i));
        }
        System.out.print(s.toString());

    }
}
