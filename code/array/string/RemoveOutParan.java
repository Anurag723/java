package string;

public class RemoveOutParan {
    public String removeOuterParentheses(String s) {
        int count = 0;
        StringBuilder sb = new StringBuilder();


        for(int i = 0; i<s.length(); i++){
            if(count==0 && s.charAt(i)=='('){
                count++;
            }
            else if(count==1 && s.charAt(i)==')'){
                count--;
            }

            else if(count>0 && s.charAt(i)=='('){
                sb.append(s.charAt(i));
                count++;
            }

            else{
                sb.append(s.charAt(i));
                count--;
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        RemoveOutParan removeOutParan = new RemoveOutParan();

        // Test cases
        String s1 = "(()())(())";
        String s2 = "()(())";
        String s3 = "(()(()))";
        
        // Testing the removeOuterParentheses method
        System.out.println("Input: " + s1 + " -> Output: " + removeOutParan.removeOuterParentheses(s1));
        System.out.println("Input: " + s2 + " -> Output: " + removeOutParan.removeOuterParentheses(s2));
        System.out.println("Input: " + s3 + " -> Output: " + removeOutParan.removeOuterParentheses(s3));
    }
}
