import java.util.UUID;
import java.util.function.*;

public class lambda1 {
    public static void main(String[] args) {
        // Predicate perform some test....
        Predicate<Integer> isEven = (x)-> x%2==0;
        Predicate<String> cred = (val) -> val.startsWith("A") && val.length()>5 && val.endsWith("Z");

        // Function take some ip and gives op....

        Function<String, Integer> chckl = (str) -> str.length();
        Function<String, Integer> chcka = (str) -> (int) str.charAt(0);
        Function<String, Integer> chckh = (str) -> str.hashCode();

        System.out.println(isEven.test(41));
        System.out.println(cred.test("ABCDEFGHIJKLMNOPQRSTUVXYZ"));

        System.out.println(chckl.apply("ABCDEFGHIJKLMNOPQRSTUVXYZ"));
        System.out.println(chcka.apply("ABCDEFGHIJKLMNOPQRSTUVXYZ"));
        System.out.println(chckh.apply("ABCDEFGHIJKLMNOPQRSTUVXYZ"));

        //Consumer recieves something return nothing....

        Consumer<String> printer = s -> System.out.println("*** " + s + " ***");
        printer.accept("Hello");

        //supplier for producing data (no input)....

        Supplier<String> uuidSupplier = () -> UUID.randomUUID().toString();
        Supplier<String> welcomeSupplier = () -> "Welcome to Java Lambda Practice!";
        Supplier<String> timeSupplier = () -> String.valueOf(System.currentTimeMillis());

        System.out.println(uuidSupplier.get());
        System.out.println(welcomeSupplier.get());
        System.out.println(timeSupplier.get());

    }
}
