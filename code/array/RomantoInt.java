public class RomantoInt {
    public static int romanToInt(String s) {
        char[] charArray = s.toCharArray();
        int rs = 0;

        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            int curr = 0;

            if (c == 'I') curr = 1;
            else if (c == 'V') curr = 5;
            else if (c == 'X') curr = 10;
            else if (c == 'L') curr = 50;
            else if (c == 'C') curr = 100;
            else if (c == 'D') curr = 500;
            else if (c == 'M') curr = 1000;

            // Look ahead to next character for subtractive pair
            if (i + 1 < charArray.length) {
                int next = 0;
                char nextChar = charArray[i + 1];

                if (nextChar == 'I') next = 1;
                else if (nextChar == 'V') next = 5;
                else if (nextChar == 'X') next = 10;
                else if (nextChar == 'L') next = 50;
                else if (nextChar == 'C') next = 100;
                else if (nextChar == 'D') next = 500;
                else if (nextChar == 'M') next = 1000;

                if (curr < next) {
                    rs += (next - curr);
                    i++; // Skip next char, already processed
                    continue;
                }
            }

            rs += curr;
        }

        return rs;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
}
