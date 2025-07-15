import java.util.*;

public class longestsubstring {

    public static int substr(String str){
        int mxres = 0;
        int res = 0;
        int start = 0;
        int end = 0;
        Set<Character> rsmp = new HashSet<>();


        while (end<str.length()) {
            if (!rsmp.contains(str.charAt(end))) {
                res++;
                rsmp.add(str.charAt(end));
                mxres = Math.max(mxres, res);
                end++;
            }
            else {
                char startChar = str.charAt(start);
                rsmp.remove(startChar);
                start++;
                res--;
            }

        }

        return mxres;
    }
    public static void main(String[] args) {
        String str = "aab";
        System.out.println(substr(str));
    }
}
