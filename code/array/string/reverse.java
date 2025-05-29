package string;

import java.util.*;

public class reverse {

    static StringBuilder rev(String str){
        StringBuilder res = new StringBuilder();

        for(int i=str.length()-1;i>=0;i--){
            res.append(str.charAt(i));
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(rev(str));
    }
}
