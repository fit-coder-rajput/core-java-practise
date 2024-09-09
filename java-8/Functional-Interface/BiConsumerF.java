import java.util.function.BiConsumer;

public class BiConsumerF {
    public static void main(String[] args) {
        BiConsumer<String, Integer> biCons = (n,a) -> System.out.println("name: "+n+", age: "+a);
        biCons.accept("Dhruv", 28);
    }
}
