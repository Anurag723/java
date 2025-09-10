package code.practice;

import java.util.*;

public class LongestPrefix {
    public String longestCommonPrefix(String[] strs) {

        if(strs.length==0) return "";

        Arrays.sort(strs);
        String prefix = strs[0];
        for(int i=1; i<strs.length;i++){
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(1,prefix.length()-1);
            }
        }
        return prefix;
    }

    public static void main(String[] args) {
        LongestPrefix lp = new LongestPrefix();

        // Example test case
        String[] strs = {"flower", "flow", "flight"};
        String result = lp.longestCommonPrefix(strs);
        System.out.println("Longest Common Prefix: " + result);

        // You can test with more cases
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + lp.longestCommonPrefix(strs2));

        String[] strs3 = {"interspace", "internet", "internal", "interval"};
        System.out.println("Longest Common Prefix: " + lp.longestCommonPrefix(strs3));
    }
}
