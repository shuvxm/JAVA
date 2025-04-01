import java.util.Arrays;
import java.util.List;

public class _3StreamDemo {
    public static void main(String[] args) {
        // Stream API
        // Stream API is used to process collections of objects. A stream is a sequence of objects that supports various methods which can be pipelined to produce the desired result.
        // Stream doesn't store data, it operates on the source data structure (collections, arrays etc) and produce pipelined data that we can use and perform operations on.
        // Stream is used to compute elements as per the pipelined methods.
        // Stream API allows functional-style operations on the elements.
        // Stream keeps the ordering of the elements the same as the ordering in the source.
        // Stream is lazy and evaluates code only when required.
        // Stream is divided into two types:
        // 1. Intermediate Operations: These operations are used to process the stream and return another stream as output. These operations are always lazy, and they do not process the stream until a terminal operation is invoked.
        // 2. Terminal Operations: These operations are used to process the stream and return the result. These operations are eager, and they process the stream immediately.
        // Stream API is introduced in Java 8.

        // feature introduced in Java 8
        // process collection of data in a functional and declarative way
        // simplify Data processing
        // Embrace functional programming
        // Improve Readability and Maintainability
        // Enable easy Paralleism without dealing the complexity of Multi-threading

        // How to use Streams ?
        // source , intermediate operations & terminal operations

        List<Integer> numbers = Arrays.asList(1,2,3,4,5);
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());
        numbers.stream().filter(x -> x % 2 == 0).forEach(System.out::println); 
    }        
    
}
