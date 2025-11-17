import java.util.*;

public class DivideTwoIntII {
    public static int sol(int dividend, int divisor){
        if (dividend == Integer.MIN_VALUE && divisor == -1) return Integer.MAX_VALUE;

        int flag = (dividend < 0) ^ (divisor < 0) ? -1 : 1;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);

        int quotient = 0;

        for (int i = 31; i >= 0; i--) {
            if ((a >> i) >= b) {
                quotient |= (1 << i);
                a -= (b << i);
            }
        }

        return quotient * flag;
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = -3;
        System.out.println(sol(dividend, divisor));
    }
}
