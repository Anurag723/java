package string;

import java.util.*;

public class MaxDepth {
    public int maxDepth(String s) {
        // Stack<Character> stc = new Stack<>();
        int currcount = 0;
        int maxcount = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == '('){
                // stc.add('(');
                currcount++;
                maxcount = Math.max(currcount, maxcount);
            }
            else if(s.charAt(i)==')'){
                // stc.pop();
                currcount--;
            }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        MaxDepth md = new MaxDepth();

        String test1 = "(1+(2*3)+((8)/4))+1";
        String test2 = "(1)+((2))+(((3)))";
        String test3 = "1+(2*3)/(2-1)";
        String test4 = "1";

        System.out.println("Max Depth of test1: " + md.maxDepth(test1)); // Expected: 3
        System.out.println("Max Depth of test2: " + md.maxDepth(test2)); // Expected: 3
        System.out.println("Max Depth of test3: " + md.maxDepth(test3)); // Expected: 1
        System.out.println("Max Depth of test4: " + md.maxDepth(test4)); // Expected: 0
    }
}
