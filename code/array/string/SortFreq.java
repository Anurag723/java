package string;
import java.util.*;

public class SortFreq {
    public String frequencySort(String s) {
        StringBuilder res = new StringBuilder();
        Map<Character, Integer> mp = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0)+1);
        }

        List<Map.Entry<Character, Integer>> entred = new ArrayList<>(mp.entrySet());
        entred.sort((a,b) -> b.getValue().compareTo(a.getValue()));

        for(Map.Entry<Character, Integer> entry:entred){
            for(int i=0; i<entry.getValue(); i++){
                res.append(entry.getKey());
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        SortFreq sorter = new SortFreq();

        String input = "tree";
        String output = sorter.frequencySort(input);

        System.out.println("Most frequent characters (once): " + output);
    }
}
