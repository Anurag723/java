import java.util.*;

public class inttospell {
    public static String spell(int num) {
        StringBuilder str = new StringBuilder();

        Map<Integer, String> mp = new HashMap<>();

        // Units
        mp.put(0, "zero");
        mp.put(1, "one");
        mp.put(2, "two");
        mp.put(3, "three");
        mp.put(4, "four");
        mp.put(5, "five");
        mp.put(6, "six");
        mp.put(7, "seven");
        mp.put(8, "eight");
        mp.put(9, "nine");
        // Teens
        mp.put(10, "ten");
        mp.put(11, "eleven");
        mp.put(12, "twelve");
        mp.put(13, "thirteen");
        mp.put(14, "fourteen");
        mp.put(15, "fifteen");
        mp.put(16, "sixteen");
        mp.put(17, "seventeen");
        mp.put(18, "eighteen");
        mp.put(19, "nineteen");
        // Tens
        mp.put(20, "twenty");
        mp.put(30, "thirty");
        mp.put(40, "forty");   // 🔧 Correct spelling
        mp.put(50, "fifty");
        mp.put(60, "sixty");
        mp.put(70, "seventy");
        mp.put(80, "eighty");
        mp.put(90, "ninety");

        if (num == 0) return mp.get(0);

        if (num >= 1000) {
            str.append(mp.get(num / 1000)).append(" thousand ");
            num %= 1000;
        }

        if (num >= 100) {
            str.append(mp.get(num / 100)).append(" hundred ");
            num %= 100;
        }

        if (num >= 20) {
            str.append(mp.get((num / 10) * 10)).append(" ");
            num %= 10;
        }

        if (num > 0) {
            str.append(mp.get(num)).append(" ");
        }

        return str.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        System.out.println(spell(3450)); // Output: three thousand four hundred fifty
    }
}
