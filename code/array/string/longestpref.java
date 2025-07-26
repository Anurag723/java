package string;

import java.util.Arrays;

public class longestpref {
    public static String longestCommonPrefix(String[] strs){
        if (strs.length==0 || strs==null) {
            return "";
        }

        Arrays.sort(strs);
        String prefix = strs[0];
        for(int i=1; i < strs.length; i++){
            while (!strs[i].startsWith(prefix)) {
                prefix = prefix.substring(0, prefix.length()-1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }

    public static void main(String[] args) {
        // Test inputs
        String[][] testCases = {
            {"flower", "flow", "flight"},
            {"dog", "racecar", "car"},
            {"interspecies", "interstellar", "interstate"},
            {"", "b"},
            {"a"},
            {"abc", "abc", "abc"},
            {"prefix", "pre", "pretest", "premature"}
        };

        // Running each test
        for (String[] test : testCases) {
            String result = longestCommonPrefix(test);
            System.out.print("Input: ");
            for (String s : test) {
                System.out.print("\"" + s + "\" ");
            }
            System.out.println("→ Output: \"" + result + "\"");
        }
    }
}
