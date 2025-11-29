public class MultiplyString {

    // --- LeetCode-style solution method ---
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];

        // Multiply digits from right to left
        for (int i = n1 - 1; i >= 0; i--) {
            for (int j = n2 - 1; j >= 0; j--) {
                int d1 = num1.charAt(i) - '0';
                int d2 = num2.charAt(j) - '0';

                int mul = d1 * d2;
                int sum = mul + res[i + j + 1];

                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        // Convert array to string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        for (int r : res) {
            if (!(sb.length() == 0 && r == 0)) {
                sb.append(r);
            }
        }

        return sb.toString();
    }

    // --- Main method for testing ---
    public static void main(String[] args) {
        MultiplyString ms = new MultiplyString();

        // Test cases
        System.out.println(ms.multiply("123", "45"));       // 5535
        System.out.println(ms.multiply("2", "3"));          // 6
        System.out.println(ms.multiply("999", "999"));      // 998001
        System.out.println(ms.multiply("0", "12345"));      // 0
        System.out.println(ms.multiply("123456789", "987654321")); // Large test
    }
}
