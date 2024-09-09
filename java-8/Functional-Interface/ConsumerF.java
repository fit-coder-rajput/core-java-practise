import java.util.function.Consumer;

public class ConsumerF {
    public static void main(String[] args) {
        Consumer<String> cons = (val) -> System.out.println("from param: "+val);
        cons.accept("Dhruv");
    }
}
