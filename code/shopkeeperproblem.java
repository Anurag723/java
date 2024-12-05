import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class shopkeeperproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<String> name = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Double> percentage = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] arofStrings = sc.nextLine().split(",",3);
            name.add(arofStrings[0]);
            price.add(Double.parseDouble(arofStrings[1]));
            percentage.add(Double.parseDouble(arofStrings[2]));
        }
        ArrayList<Double> dis = new ArrayList<>();

        for(int i = 0;i<name.size();i++){
            dis.add((price.get(i))*(percentage.get(i)/100));
        }

        Double max = Double.MIN_VALUE;

        for (Double double1 : dis) {
            if (max<double1) {
                max = double1;
            };
        }
        for (int i = 0; i < dis.size(); i++) {
            if (max==dis.get(i)) {
                System.out.println(name.get(i));
                System.out.println(price.get(i));
                System.out.println(percentage.get(i));
                System.out.println(dis.get(i));
            }
        }

        sc.close();
    }
}
