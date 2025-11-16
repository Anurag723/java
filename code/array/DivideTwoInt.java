import java.util.*;

public class DivideTwoInt{
    public static int sol(int dividend, int divisor){
        if(dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;;
        return (dividend/divisor);
    }
    public static void main(String[] args) {
        int dividend = 10;
        int divisor = -3;
        System.out.println(sol(dividend, divisor));
    }
}