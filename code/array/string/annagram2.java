package string;

import java.util.HashMap;
import java.util.Map;

public class annagram2 {
    public static boolean angrm(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Integer> chk = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            chk.put(s.charAt(i), chk.getOrDefault(s.charAt(i), 0)+1);
        }

        for(int i = 0; i<t.length(); i++){
            chk.put(t.charAt(i), chk.getOrDefault(t.charAt(i), 0)-1);
        }

        for (Map.Entry<Character, Integer> entry : chk.entrySet()){
            if (entry.getValue()!=0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(angrm("racecar", "carrace"));
    }
}
