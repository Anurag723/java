import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public List<Integer> grayCode1(int n) {             //Optimal
        int size = 1 << n;
        List<Integer> res = new java.util.AbstractList<>() {
            public Integer get(int i) { return i ^ (i >> 1); }
            public int size() { return size; }
        };
        return res;
    }

    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<>();
        int size = 1 << n;  // 2^n

        for (int i = 0; i < size; i++) {
            result.add(i ^ (i >> 1));  // Gray code formula
        }

        return result;
    }

    public static void main(String[] args) {
        GrayCode gc = new GrayCode();
        
        int n = 3;  // you can change this value
        
        List<Integer> grayCodes = gc.grayCode(n);

        System.out.println("Gray Code for n = " + n + ":");
        for (int code : grayCodes) {
            System.out.println(code);
        }
    }
}
