package string;

public class RotatedString {
    public boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        RotatedString rs = new RotatedString();

        String s1 = "abcdef";
        String g1 = "defabc";

        String s2 = "abcde";
        String g2 = "abced";

        System.out.println("Is \"" + g1 + "\" rotation of \"" + s1 + "\"? " + rs.rotateString(s1, g1)); // true
        System.out.println("Is \"" + g2 + "\" rotation of \"" + s2 + "\"? " + rs.rotateString(s2, g2)); // false
    }
}
