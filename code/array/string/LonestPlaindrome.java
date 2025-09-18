package string;

public class LonestPlaindrome {
    private String expandAroundCenter(String s, int left, int right){
        while (left>=0 && right<s.length() && s.charAt(left)==s.charAt(right)) {
            left--;
            right++;
        }
        return s.substring(left, right);
    }
    public String longestPalindrome(String s) {
        if(s.length()==1 || s==null) return "";

        String res = "";
        for(int i=0; i<s.length(); i++){
            String plaindrome1 = expandAroundCenter(s, i, i);
            String plaindrome2 = expandAroundCenter(s, i, i+1);

            if(plaindrome1.length()>res.length()){
                res = plaindrome1;
            }

            if(plaindrome2.length()>res.length()){
                res = plaindrome2;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        LonestPlaindrome lp = new LonestPlaindrome();
        
        // Test cases
        String input1 = "babad";
        String input2 = "cbbd";
        String input3 = "a";
        String input4 = "ac";
        
        // Test longest palindrome
        System.out.println("Longest palindrome in '" + input1 + "': " + lp.longestPalindrome(input1));  // "bab" or "aba"
        System.out.println("Longest palindrome in '" + input2 + "': " + lp.longestPalindrome(input2));  // "bb"
        System.out.println("Longest palindrome in '" + input3 + "': " + lp.longestPalindrome(input3));  // "a"
        System.out.println("Longest palindrome in '" + input4 + "': " + lp.longestPalindrome(input4));  // "a" or "c"
    }
}
