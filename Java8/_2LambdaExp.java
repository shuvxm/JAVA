import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class _2LambdaExp {

    // lambda expression is an anonumous function (no name, no return type, no
    // access modifier)

    public static void main(String[] args) {

        // Thread t1 = new Thread(new Task());

        // using lambda expression to avoid new create class as Task
        Thread t1 = new Thread(() -> {
            System.out.println("Heloo");
        });

        MathOperation sumOperation = (a, b) -> a + b;
        MathOperation subOperation = (a, b) -> a - b;
        MathOperation mulOperation = (a, b) -> a * b;

        int res = sumOperation.operate(2, 1);
        System.out.println(res);

        // Predicate --> functional interface (Boolean valued function)
        Predicate<Integer> isEven = x -> x % 2 == 0;
        System.out.println(isEven.test(4));

        Predicate<String> isWordStartingWithA = x -> x.toLowerCase().startsWith("a");
        System.out.println(isWordStartingWithA.test("null"));
        Predicate<String> isWordEndingWithT = x -> x.toLowerCase().endsWith("t");

        // checking 2 condition (predicate) together
        Predicate<String> and = isWordStartingWithA.and(isWordEndingWithT);
        System.out.println(and.test("Ankit"));

        // Function is also a functional interface (only 1 method contain) introduced in
        // 1.8 --> work for you
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        System.out.println(doubleIt.apply(100));

        // Consumer --> just accept something it will only consume not give anything
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(100);
        List<Integer> list = Arrays.asList(1,2,3);
        Consumer<List<Integer>> printList = x -> {
            for (Integer i : x) {
                System.out.println(i);
            }
        };
        printList.accept(list);

        // supplier --> just return something it will not accept anything
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());


        // combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())) {
            consumer.accept(function.apply(supplier.get()));
        }

        // Biconsumer, BiFunction, BiPredicate 

        BiPredicate<Integer, Integer> isSumEven  = (a, b) -> (a+b) % 2 == 0;
        System.out.println(isSumEven.test(2, 3));
        BiConsumer<Integer, Integer> printSum = (a, b) -> System.out.println(a+b);
        BiFunction<String, String, Integer> sum = (a, b) -> (a+b).length();
        System.out.println(sum.apply("Ankit", "Kumar"));

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> a = x -> 2 * x;
        BinaryOperator<Integer> b = (x, y) -> x + y;

        // Method reference -> use method without invoking  & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ankit");
        students.forEach(x -> System.out.println(x));  // using Consumer here
        students.forEach(System.out::println); // same as previous but using method reference (more concise)

        // Constructor reference -> use constructor without invoking & in place of lambda expression
       






    }

}

/*
 * class Task implements Runnable{
 * 
 * @Override
 * public void run() {
 * System.out.println("Heloo");
 * }
 * }
 */

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);

    default int mat(int a) {
        return a;
    }
}

/*
 * Functional Interface consist of only one abstract method, apart from abstract
 * you can keep default, static methods
 */