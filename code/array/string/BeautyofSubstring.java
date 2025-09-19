package string;

import java.util.HashMap;

public class BeautyofSubstring {
    private int count(String s){
        HashMap<Character, Integer> mp = new HashMap<>();
        int minval = Integer.MAX_VALUE;
        int maxval = Integer.MIN_VALUE;

        for(char c:s.toCharArray()){
            mp.put(c, mp.getOrDefault(c, 0)+1);
        }

        for(int val:mp.values()){
            if(val>maxval) maxval = val;
            if(val<minval) minval = val;
        }
        return maxval-minval;
    }
    public int beautySum(String s) {
        int res = 0;

        for(int i=0; i<s.length(); i++){
            for(int j=i; j<s.length();j++){
                String sub = s.substring(i, j+1);
                res+=count(sub);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        BeautyofSubstring bos = new BeautyofSubstring();
        String input = "aabcb";
        int result = bos.beautySum(input);
        System.out.println("Total beauty of all substrings: " + result);
    }
}
