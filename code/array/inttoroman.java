import java.util.*;

public class inttoroman{

    public static String intToRoman(int num) {
        StringBuilder rs = new StringBuilder();
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40, 10, 9, 5, 4, 1};
        String[] symbols ={"M",  "CM","D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        for(int i=0; i<values.length && num>0; i++){
            while (num>=values[i]) {
                rs.append(symbols[i]);
                num-=values[i];
            }
        }

        return rs.toString();
    }

    public static void main(String[] args) {
        System.out.println(intToRoman(3749));
    }
}