public class lambdacalculator {
    public interface calculator {
        int solve(int a, int b);
    }

    public static void main(String[] args) {
        calculator sum = (a,b) -> a+b;
        calculator diff = (a,b) -> a-b;
        calculator prod = (a,b) -> a*b;
        calculator div = (a,b) -> {
            if (b==0) {
                throw new ArithmeticException();
            }
            return a/b;
        };

        System.out.println(sum.solve(4,8));
        System.out.println(diff.solve(4,8));
        System.out.println(prod.solve(4,8));
        System.out.println(div.solve(4,2));
    }
}
