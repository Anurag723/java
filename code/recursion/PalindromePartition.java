import java.util.ArrayList;
import java.util.List;

public class PalindromePartition {

    public List<List<String>> partition(String s) {
        List<List<String>> ans = new ArrayList<>();
        sol(0, ans, new ArrayList<String>(), s);
        return ans;
    }

    private void sol(int start, List<List<String>> ans, List<String> temp, String s) {
        if (start == s.length()) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            if (isPalindrome(s, start, i)) {
                temp.add(s.substring(start, i + 1));
                sol(i + 1, ans, temp, s);
                temp.remove(temp.size() - 1);
            }
        }
    }

    private boolean isPalindrome(String s, int start, int end) {
        while (start <= end) {
            if (s.charAt(start++) != s.charAt(end--))
                return false;
        }
        return true;
    }

    // Runner method
    public static void main(String[] args) {
        PalindromePartition obj = new PalindromePartition();

        String s = "aab";
        List<List<String>> result = obj.partition(s);

        System.out.println("Palindrome partitions of \"" + s + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
}
