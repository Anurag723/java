package string;

import java.util.*;

class groupannagram{

    public List<List<String>> groupAnagrams(String[] strs){
        Map<String,List<String>> re = new HashMap<>();

        for(String str:strs){
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String nch = String.valueOf(charArr);

            if (!re.containsKey(nch)) {
                re.put(nch, new ArrayList<>());
            }
            re.get(nch).add(str);
        }

        return new ArrayList<>(re.values());
    }

    public static void main(String[] args) {
        groupannagram sol = new groupannagram();
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(sol.groupAnagrams(input));
    }
}