
// Functional Interfaces
import java.util.function.*;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        // Temperature Alert System
        Predicate<Double> alert = temp -> temp > 40;
        System.out.println("Temperature Alert: " + alert.test(42.5));

        // String Length Checker
        Function<String, Integer> lengthChecker = msg -> msg.length();
        System.out.println("Message length: " + lengthChecker.apply("Interface Practice"));

        // Background Job Execution
        Runnable job = () -> System.out.println("Running background job...");
        job.run();
    }
}
