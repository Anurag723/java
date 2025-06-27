//key value pair using generics

import java.util.*;

public class generics6 {
    public static<k, v> void mapm(Map<k, v> mp){
        for (Map.Entry < k, v > entry: mp.entrySet()) {
            k key = entry.getKey();
            v value = entry.getValue();
            System.out.println("Key:-"+key+"  Value:-"+value);
        }
    }
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Red", 1);
        map.put("Blue", 2);
        map.put("Green", 3);

        mapm(map);
    }
}
