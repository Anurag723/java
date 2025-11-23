import java.util.Optional;

public class OptionalDemo {

    // Example 1: Returning Optional instead of null
    public Optional<String> findUserById(Integer id) {
        if (id == null || id <= 0) {
            return Optional.empty();
        }
        return Optional.of("User" + id);
    }

    // Example 2: Optional.of(), Optional.empty(), Optional.ofNullable()
    public void basicOptionalCreation() {
        Optional<String> opt1 = Optional.of("Hello");
        Optional<String> opt2 = Optional.empty();
        Optional<String> opt3 = Optional.ofNullable(null);

        System.out.println("opt1: " + opt1);
        System.out.println("opt2: " + opt2);
        System.out.println("opt3: " + opt3);
    }

    // Example 3: isPresent(), isEmpty(), ifPresent()
    public void presenceChecks() {
        Optional<String> opt = Optional.of("Java Optional");

        if (opt.isPresent()) {
            System.out.println("Value is: " + opt.get());
        }

        Optional<String> emptyOpt = Optional.empty();
        System.out.println("emptyOpt is empty? " + emptyOpt.isEmpty());

        opt.ifPresent(value -> System.out.println("ifPresent(): " + value));
    }

    // Example 4: ifPresentOrElse()
    public void ifPresentOrElseExample(Optional<String> opt) {
        opt.ifPresentOrElse(
                v -> System.out.println("Value: " + v),
                () -> System.out.println("Value not present")
        );
    }

    // Example 5: orElse(), orElseGet(), orElseThrow()
    public void fallbackExamples() {
        Optional<String> opt1 = Optional.of("Available");
        Optional<String> opt2 = Optional.empty();

        System.out.println("orElse: " + opt2.orElse("Default Value"));
        System.out.println("orElseGet: " + opt2.orElseGet(() -> "Generated Default"));
        System.out.println("orElseThrow (opt1): " + opt1.orElseThrow(() -> new RuntimeException("No value")));
        
        try {
            System.out.println(opt2.orElseThrow(() -> new RuntimeException("Value missing!")));
        } catch (RuntimeException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }

    // Example 6: map() and flatMap()
    public void mappingExamples() {
        Optional<String> nameOpt = Optional.of("Java");

        Optional<Integer> lengthOpt = nameOpt.map(String::length);
        System.out.println("Length using map: " + lengthOpt.orElse(0));

        Optional<Optional<String>> nested = Optional.of(Optional.of("Nested"));
        Optional<String> flattened = nested.flatMap(v -> v);
        System.out.println("Flattened value: " + flattened.orElse("None"));
    }

    // Example 7: filter()
    public void filterExample() {
        Optional<Integer> ageOpt = Optional.of(25);

        ageOpt
            .filter(age -> age >= 18)
            .ifPresent(age -> System.out.println("Adult age: " + age));

        Optional<Integer> smallAge = Optional.of(10);

        smallAge
            .filter(age -> age >= 18)
            .ifPresentOrElse(
                    System.out::println,
                    () -> System.out.println("Not an adult")
            );
    }

    // MAIN METHOD (Runner)
    public static void main(String[] args) {
        OptionalDemo demo = new OptionalDemo();

        System.out.println("=== Basic Optional Creation ===");
        demo.basicOptionalCreation();

        System.out.println("\n=== Presence Checks ===");
        demo.presenceChecks();

        System.out.println("\n=== ifPresentOrElse Example ===");
        demo.ifPresentOrElseExample(Optional.of("Hello World"));
        demo.ifPresentOrElseExample(Optional.empty());

        System.out.println("\n=== Fallback Methods ===");
        demo.fallbackExamples();

        System.out.println("\n=== Map and FlatMap Examples ===");
        demo.mappingExamples();

        System.out.println("\n=== Filter Example ===");
        demo.filterExample();

        System.out.println("\n=== Optional Return Example ===");
        System.out.println("findUserById(5): " + demo.findUserById(5));
        System.out.println("findUserById(-1): " + demo.findUserById(-1));
    }
}
