import java.util.function.BiFunction;

public class BiFunctionD {
    public static void main(String[] args) {
        BiFunction<String, Integer, Integer> bif = (name, age) -> name.length()+age;
        System.out.println(bif.apply("Dhruv", 28));
    }
}
