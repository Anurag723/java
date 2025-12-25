import java.util.*;

public class RestoreIP {

    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        backtrack(s, 0, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(String s, int index, List<String> path, List<String> result) {
        // If we have 4 parts and used all characters
        if (path.size() == 4) {
            if (index == s.length()) {
                result.add(String.join(".", path));
            }
            return;
        }

        // Try 1 to 3 digits
        for (int len = 1; len <= 3; len++) {
            if (index + len > s.length()) break;

            String part = s.substring(index, index + len);

            // Skip leading zero numbers
            if (part.length() > 1 && part.startsWith("0")) continue;

            int num = Integer.parseInt(part);
            if (num > 255) continue;

            path.add(part);
            backtrack(s, index + len, path, result);
            path.remove(path.size() - 1);
        }
    }

    public static void main(String[] args) {
        RestoreIP solution = new RestoreIP();

        String input = "25525511135";
        List<String> ips = solution.restoreIpAddresses(input);

        System.out.println("Valid IP addresses:");
        for (String ip : ips) {
            System.out.println(ip);
        }
    }
}
