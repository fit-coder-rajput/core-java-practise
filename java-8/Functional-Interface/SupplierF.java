import java.util.function.Supplier;

public class SupplierF {
    public static void main(String[] args) {
        Supplier<Integer> sp = ()-> 35;
        System.out.println(sp.get());

    }
}
