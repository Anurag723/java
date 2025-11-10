import java.util.*;

public class PlusOne {

    public static int[] plusOne(int[] digits) {
        List<Integer> res = new ArrayList<>();
        int carry = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            res.add(sum % 10);
            carry = sum / 10;
        }

        if (carry > 0) res.add(carry);

        Collections.reverse(res);
        int[] sol = new int[res.size()];

        for (int i = 0; i < res.size(); i++) {
            sol[i] = res.get(i);
        }

        return sol;
    }

    public static void main(String[] args) {
        int[] digits = {9, 9, 9, 9};

        int[] result = plusOne(digits);

        System.out.print("Result: ");
        System.out.println(Arrays.toString(result));
    }
}
