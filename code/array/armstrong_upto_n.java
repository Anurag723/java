// from string Part-1

import java.util.*;
public class armstrong_upto_n {
    public static void armstrong(String str){
        int p = str.length();
        int n = Integer.parseInt(str);
        int m = n;
        int sum = 0;
        while (m>0) {
            sum = (int)(sum + Math.pow(m%10,p));
            m/=10;
        }
        if (sum==n) {
            System.out.println(sum);
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        for (int i = 0; i <= (Integer.parseInt(str)); i++) {
            armstrong(Integer.toString(i));
        }
        armstrong(str);
        sc.close();
    }
}
