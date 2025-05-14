import java.util.*;

class prime_upto_n{
    public static boolean isprime(int n){
        boolean res = true;
        for(int i=2;i<Math.sqrt(n);i++){
            if (n%i==0) {
                res=false;
                break;
            }
            else{
                res=true;
            }
        }
        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 2; i <= n; i++) {
            if (isprime(i)) {
                System.out.println(i);
            }
        }
        sc.close();
    }
}