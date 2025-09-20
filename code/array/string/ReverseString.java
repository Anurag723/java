package string;

public class ReverseString {

    public String reverseWords(String s) {
        String[] arr = s.split("\\+s");
        StringBuilder sb = new StringBuilder();

        for(int i=arr.length-1; i>=0; i--){
            sb.append(arr[i]);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
    public static void main(String[] args) {
        ReverseString rs = new ReverseString();

        // Sample input
        String input = "  Hello   world this   is Java  ";
        String reversed = rs.reverseWords(input);

        // Output result
        System.out.println("Original: \"" + input + "\"");
        System.out.println("Reversed: \"" + reversed + "\"");
    }
}
