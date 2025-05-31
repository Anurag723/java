import java.util.*;

class duplicate{
    static Map<Character,Integer> fd(String str){
        Map<Character, Integer> res = new HashMap<>();
        for (int i = 0; i<str.length(); i++) {
            if(res.containsKey(str.charAt(i)))
                res.put(str.charAt(i) , res.get(str.charAt(i))+1); 
            else res.put(str.charAt(i),1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ip = sc.nextLine();
        Map<Character,Integer> ans = fd(ip);

        for(Map.Entry<Character, Integer> mapentry:ans.entrySet()){
            if (mapentry.getValue() > 1)
                System.out.println(mapentry.getKey() + ", count = " + mapentry.getValue());
        }

        sc.close();
    }
}