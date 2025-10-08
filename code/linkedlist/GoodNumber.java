import java.util.Scanner;

public class GoodNumber {
    private static final int MOD = 1_000_000_007;

    public int countGoodNumbers(long n) {
        long evenPositions = (n + 1) / 2;  // even indices
        long oddPositions = n / 2;         // odd indices

        long evenSide = calc(5, evenPositions);
        long oddSide = calc(4, oddPositions);

        return (int)((evenSide * oddSide) % MOD);
    }

    // Recursive modular exponentiation: (base^exp) % MOD
    private long calc(long base, long exp) {
        if (exp == 0) return 1;

        long half = calc(base, exp / 2);
        long result = (half * half) % MOD;

        if (exp % 2 == 1) {
            result = (result * base) % MOD;
        }

        return result;
    }

    // Runner method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        long n = scanner.nextLong();

        GoodNumber solution = new GoodNumber();
        int result = solution.countGoodNumbers(n);

        System.out.println("Number of good digit strings of length " + n + " is: " + result);
    }
}
