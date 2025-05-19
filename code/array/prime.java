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

    static List<Integer> allprime(int num){
        List<Integer> ans = new ArrayList<>();
        for (int i = 1; i <= num; i++){
            if (isprime(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        System.out.println(isprime(num));
        System.out.println(allprime(num));
    }
}
