class Solution{
    public double myPow(double x, int n){
        long N = n;
        if(N<0){
            x=1/x;
            N=-N;
        }

        return power(x, N);
    }

    private double power(double x, Long N){
        if(N==0) return 1.0;
        double ans = power(x, N/2);
        if(N%2==0) return ans*ans;
        else return ans*ans*x;
    }
}

public class RecPow {
    public static void main(String[] args) {
        Solution sol = new Solution();

        double result1 = sol.myPow(2, 10);
        double result2 = sol.myPow(2, -2);
        double result3 = sol.myPow(5, 0);
        double result4 = sol.myPow(2, -2147483648); // Integer.MIN_VALUE

        System.out.println("2^10 = " + result1);
        System.out.println("2^-2 = " + result2);
        System.out.println("5^0 = " + result3);
        System.out.println("2^-2147483648 = " + result4);
    }
}
