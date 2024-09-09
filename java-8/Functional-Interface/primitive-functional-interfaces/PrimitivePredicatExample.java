import java.util.function.IntPredicate;
import java.util.function.LongPredicate;

public class PrimitivePredicatExample {
    public static void main(String[] args) {
        IntPredicate intP = (a) -> a%2 == 0;   // no auto boxing needed
        System.out.println(intP.test(4));


        LongPredicate longP = (a) -> a%2 == 0;
        System.out.println(longP.test(12));

    }
}
