package string;

public class LargestOddString {

    public static String largestOddNumber(String num) {
        for(int i=num.length()-1; i>=0; i--){
            if ((num.charAt(i)-'0')%2!=0) return num.substring(0, i+1);
        }

        return "";
    }
    public static void main(String[] args) {
        // Test cases
        String[] testInputs = {
            "1903",     // Expected: "1903"
            "4206",     // Expected: ""
            "1358",     // Expected: "135"
            "24680",    // Expected: ""
            "3579",     // Expected: "3579"
            "1234567890" // Expected: "123456789"
        };

        for (String input : testInputs) {
            String result = largestOddNumber(input);
            System.out.println("Input: " + input + " => Largest Odd Number: " + result);
        }
    
    }
}
