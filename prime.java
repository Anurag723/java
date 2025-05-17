import java.util.*;
public class prime {
    static boolean isprime(int i){
        if (i < 2) return false;
        int a = (int)Math.sqrt(i);
        for (int j = 2; j <= a; j++) {
            if (i%j==0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(isprime(num));
    }
}
