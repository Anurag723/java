//import java.util.*;

//public class BaseConverter {

    // Convert a character to its numeric value
//    static int charToValue(char c) {
//        if (c >= '0' && c <= '9') return c - '0';
//        else if (c >= 'A' && c <= 'Z') return c - 'A' + 10;
//        else if (c >= 'a' && c <= 'z') return c - 'a' + 10;
//        else throw new IllegalArgumentException("Invalid character: " + c);
//    }

    // Convert a number string from any base to decimal
//    static int toDecimal(String number, int fromBase) {
//         int result = 0;
//         int power = 1; // from right to left

//         for (int i = number.length() - 1; i >= 0; i--) {
//             int digit = charToValue(number.charAt(i));
//             if (digit >= fromBase) {
//                 throw new IllegalArgumentException("Digit " + number.charAt(i) + " not valid for base " + fromBase);
//             }
//             result += digit * power;
//             power *= fromBase;
//         }

//         return result;
//     }

//     // Convert a decimal number to any base
//     static String fromDecimal(int decimal, int toBase) {
//         if (decimal == 0) return "0";

//         StringBuilder result = new StringBuilder();
//         while (decimal > 0) {
//             int remainder = decimal % toBase;
//             result.insert(0, valueToChar(remainder));
//             decimal /= toBase;
//         }
//         return result.toString();
//     }

//     // Convert a numeric value to its character representation
//     static char valueToChar(int value) {
//         if (value >= 0 && value <= 9) return (char) ('0' + value);
//         else return (char) ('A' + (value - 10)); // for bases > 10
//     }

//     // Convert from one base to another
//     static String convertBase(String number, int fromBase, int toBase) {
//         int decimal = toDecimal(number, fromBase);
//         return fromDecimal(decimal, toBase);
//     }

//     public static void main(String[] args) {
//         String number = "1A3";
//         int fromBase = 16;
//         int toBase = 2;

//         String converted = convertBase(number, fromBase, toBase);
//         System.out.println("Converted: " + converted); // Output: Converted: 110100011
//     }
// }


import java.util.*;

public class BaseConverter {

    // Convert a number string from any base to decimal
    static int toDecimal(String number, int fromBase) {
        if (fromBase < 2 || fromBase > 36)
            throw new IllegalArgumentException("Invalid fromBase: " + fromBase);

        number = number.toUpperCase();
        int result = 0;

        for (char c : number.toCharArray()) {
            int digit = Character.digit(c, fromBase);
            if (digit == -1)
                throw new IllegalArgumentException("Invalid digit '" + c + "' for base " + fromBase);
            result = result * fromBase + digit;
        }

        return result;
    }

    // Convert a decimal number to any base
    static String fromDecimal(int decimal, int toBase) {
        if (toBase < 2 || toBase > 36)
            throw new IllegalArgumentException("Invalid toBase: " + toBase);

        if (decimal == 0) return "0";

        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            result.insert(0, Character.forDigit(decimal % toBase, toBase));
            decimal /= toBase;
        }

        return result.toString();
    }

    // Convert from one base to another
    static String convertBase(String number, int fromBase, int toBase) {
        return fromDecimal(toDecimal(number, fromBase), toBase);
    }

    public static void main(String[] args) {
        String number = "1A3";
        int fromBase = 16;
        int toBase = 2;

        String converted = convertBase(number, fromBase, toBase);
        System.out.println("Converted: " + converted); // Output: Converted: 110100011
    }
}
