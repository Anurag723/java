import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");

        boolean result = solution.wordBreak(s, wordDict);
        System.out.println("Can be segmented: " + result);
    }
}

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> st = new HashSet(wordDict);
        Map<String, Boolean> mp = new HashMap<>();
        return sol(s, st, mp);
    }

    private boolean sol(String s, Set<String> st, Map<String, Boolean> mp){
        if(s.isEmpty()) return true;
        if(mp.containsKey(s)) return mp.get(s);

        for(int i=1; i<=s.length(); i++){
            String pre = s.substring(0,i);
            String suff = s.substring(i);

            if(st.contains(pre) && sol(suff, st, mp)){
                mp.put(s, true);
                return true;
            }
        }

        mp.put(s, false);
        return false;
    }
}