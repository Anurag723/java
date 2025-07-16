package string;

import java.util.Arrays;

public class anagram {
    public static boolean isAnagram(String s, String t) {
        char[] sarr = s.toCharArray();
        char[] tarr = t.toCharArray();
        
        Arrays.sort(sarr);
        Arrays.sort(tarr);

        return Arrays.equals(sarr,tarr);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("racecar", "carrace"));
    }
}
