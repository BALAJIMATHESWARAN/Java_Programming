import java.util.*;
public class RansomNote {
    public static void main(String [] args){
        String ransomNote = "aac";
        String magazine = "aabc";

        char ransomNoteC[] = ransomNote.toCharArray();
        char magazineC[] = magazine.toCharArray();
        HashMap <Character , Integer> hm = new HashMap<>();

        for(char ch : magazineC){
            hm.put(ch, hm.getOrDefault(ch,0)+1);
        }
        for(char ch : ransomNoteC){
            if(!hm.containsKey(ch) || hm.get(ch) == 0){
                System.out.println("Invalid");
                return;
            }
            hm.put(ch, hm.getOrDefault(ch,0)-1);
        }
        System.out.println("Valid");
    }
}
