import java.util.*;

class valid_paran{

    public static boolean isValid(String str){
        Stack<Character> stack = new Stack<>();

        for (char ch : str.toCharArray()) {
            if (ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);
            }

            else{
            
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();
                if ((ch == '(' && top != ')')|| (ch == '{' && top != '}')||(ch == '[' && top != ']')) {
                        return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String input = "()[]{}";  // You can change this input for testing
        boolean result = isValid(input);
        System.out.println("Is the input valid? " + result);
    }
}