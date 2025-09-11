package string;
import java.util.*;

class Isomorphic{
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;
        
        Map<Character, Character> mpstot = new HashMap<>();
        Map<Character, Character> mpttos = new HashMap<>();

        for(int i=0; i<s.length(); i++){
            char sc = s.charAt(i);
            char tc = t.charAt(i);

            if(mpstot.containsKey(sc)){
                if(mpstot.get(sc)!=tc) return false;
            }
            else{
                mpstot.put(sc,tc);
            }

            if(mpttos.containsKey(tc)){
                if(mpttos.get(tc)!=sc) return false;
            }
            else{
                mpttos.put(tc,sc);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        System.out.println(iso.isIsomorphic("egg", "add"));     // true
        System.out.println(iso.isIsomorphic("foo", "bar"));     // false
        System.out.println(iso.isIsomorphic("paper", "title")); // true
        System.out.println(iso.isIsomorphic("ab", "aa"));       // false
    }
}