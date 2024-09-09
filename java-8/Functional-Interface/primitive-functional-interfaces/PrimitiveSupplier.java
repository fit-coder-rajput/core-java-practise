import java.util.function.IntSupplier;

public class PrimitiveSupplier {
    public static void main(String[] args) {
        IntSupplier is = () -> 10;
        System.out.println(is.getAsInt());
    }
}
