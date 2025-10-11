package code.recursion;

import java.util.HashMap;
import java.util.Map;

public class DistinctSubsequence {
    public static int distinctSubseqII(String s) {
        Map<String, Integer> res = new HashMap<>();
        sol(0, new StringBuilder(), res, s);
        return res.size();
    }

    private static void sol(int start, StringBuilder curr, Map<String, Integer> res, String s){
        if(curr.length()!=0){
            res.put(curr.toString(), res.getOrDefault(curr.toString(),0)+1);
        }

        for(int i=start; i<s.length(); i++){
            curr.append(s.charAt(i));
            sol(i+1, curr, res, s);
            curr.deleteCharAt(curr.length() - 1);
        }
    }
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(distinctSubseqII(s));
    }
}
