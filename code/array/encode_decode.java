import java.util.*;

public class encode_decode {
    public String encode(List<String> strs) {
        StringBuilder sbd = new StringBuilder();
        for(String s:strs){
            sbd.append(s.length()).append('#').append(s);
        }

        return sbd.toString();
    }

    public List<String> decode(String str) {
        List<String> rs = new ArrayList<>();
        int i = 0;
        while (i<str.length()) {
            int j = i;
            while (str.charAt(j)!='#') {
                j++;
            }

            int length = Integer.parseInt(str.substring(i, j));

            j++;

            rs.add(str.substring(j, j+length));
            i = j+length;
        }

        return rs;
    }
}
