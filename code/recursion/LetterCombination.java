import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombination {

    // Digit to characters mapping
    private static final Map<Character, String> digitToChar = new HashMap<>();

    static {
        digitToChar.put('2', "abc");
        digitToChar.put('3', "def");
        digitToChar.put('4', "ghi");
        digitToChar.put('5', "jkl");
        digitToChar.put('6', "mno");
        digitToChar.put('7', "pqrs");
        digitToChar.put('8', "tuv");
        digitToChar.put('9', "wxyz");
    }

    // Public method to get combinations
    public List<String> letterCombinations(String digits) {
        if (digits == null || digits.length() == 0) {
            return new ArrayList<String>();
        }
        List<String> ans = new ArrayList<>();
        sol(0, new StringBuilder(), ans, digits);
        return ans;
    }

    // Recursive backtracking helper method
    private void sol(int start, StringBuilder temp, List<String> ans, String digits) {
        if (start == digits.length()) {
            ans.add(temp.toString());
            return;
        }

        char dig = digits.charAt(start);
        String val = digitToChar.get(dig);
        for (char i : val.toCharArray()) {
            temp.append(i);
            sol(start + 1, temp, ans, digits);
            temp.deleteCharAt(temp.length() - 1); // backtrack
        }
    }

    // Main method to run the program
    public static void main(String[] args) {
        LetterCombination obj = new LetterCombination();
        
        String input = "23"; // You can change this to test other digits
        List<String> result = obj.letterCombinations(input);

        System.out.println("Letter combinations for \"" + input + "\":");
        for (String combination : result) {
            System.out.println(combination);
        }
    }
}
