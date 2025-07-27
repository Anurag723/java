package string;

import java.util.*;

class substrconcat{
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();

        if (s == null || words == null || words.length == 0) return result;


        int wlen = words[0].length();
        int numword = words.length;
        int winsz = wlen*numword;

        if (s.length() < winsz) return result;

        Map<String, Integer> rpt = new HashMap<>();

        for(String word:words){
            rpt.put(word, rpt.getOrDefault(word, 0)+1);
        }

        for (int i = 0; i < wlen; i++) {
            int left = i, right = i;
            Map<String, Integer> windowMap = new HashMap<>();
            int count = 0;

            while (right + wlen <= s.length()) {
                String word = s.substring(right, right + wlen);
                right += wlen;

                if (rpt.containsKey(word)) {
                    windowMap.put(word, windowMap.getOrDefault(word, 0) + 1);
                    count++;

                    // If word appears more than expected, shrink the window
                    while (windowMap.get(word) > rpt.get(word)) {
                        String leftWord = s.substring(left, left + wlen);
                        windowMap.put(leftWord, windowMap.get(leftWord) - 1);
                        left += wlen;
                        count--;
                    }

                    // If count matches total words, record the start index
                    if (count == numword) {
                        result.add(left);
                    }
                } else {
                    // Reset the window
                    windowMap.clear();
                    count = 0;
                    left = right;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        substrconcat sc = new substrconcat();

        // Example input
        String s = "barfoofoobarthefoobarman";
        String[] words = {"bar", "foo", "the"};

        List<Integer> result = sc.findSubstring(s, words);

        System.out.println("Starting indices: " + result);
    }
}