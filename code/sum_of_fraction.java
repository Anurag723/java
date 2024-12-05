import java.util.*;
public class sum_of_fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for(int i=1;i<=n;i++){
            sum = sum+(1.0/i);
        }
        System.out.println(sum);
        sc.close();
    }
}
