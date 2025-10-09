package code.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParanthesis {
    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        sol("",0,0,n,ans);
        return ans;
    }

    private static void sol(String curr, int open, int close, int total, List<String> ans){
        if(curr.length()==2*total){
            ans.add(curr);
            return;
        }

        if(open<total){
            sol(curr+"(", open+1, close, total, ans);
        }

        if(close<open){
            sol(curr+")", open, close+1, total, ans);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(generateParenthesis(sc.nextInt()));
    }
}
