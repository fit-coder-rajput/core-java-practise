import java.util.function.IntConsumer;

public class PrimitiveConsumer {
    public static void main(String[] args) {
        IntConsumer ic = (x) -> System.out.println(x);
        ic.accept(5);
    }
}
