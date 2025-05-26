import java.util.*;

public class sqrtforall {
    static double sqrt(int num){
        if (num < 0) return -1;
        if (num == 0 || num == 1) return num;
        int res = 0;

        

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(sqrt(num));
        sc.close();
    }
}
