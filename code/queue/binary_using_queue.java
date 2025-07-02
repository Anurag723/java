package code.queue;
import java.util.*;

public class binary_using_queue {

    public static String[] numtonbin(int n){
        String[] res = new String[n];
        Queue<String> q = new LinkedList<>();
        q.offer("1");

        for (int i = 0; i < n; i++) {
            res[i] = q.poll();
            String n1 = res[i] + "0";
            String n2 = res[i] + "1";
            q.offer(n1);
            q.offer(n2);
        }

        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        String[] res = numtonbin(num);

        for (String string : res) {
            System.out.print(string+"->");
        }
        System.out.println("....");
    }
}
