package string;
import java.util.*;

public class plaindrome {
    static boolean plai(String s){
        int i = 0;
        int j = s.length()-1;

        while (i<j) {
            if(s.charAt(i)!=s.charAt(j))
                return false;

            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        System.out.println(plai(s));
    }
}
