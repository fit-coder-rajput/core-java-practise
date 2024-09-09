import java.util.function.IntFunction;
import java.util.function.IntToDoubleFunction;
import java.util.function.LongFunction;
import java.util.function.ToLongBiFunction;
import java.util.function.ToLongFunction;

public class PrimitiveFunction {
    
    public static void main(String[] args) {
        IntFunction<String> iF = (a) -> String.valueOf(a);  // input primitive output object
        System.out.println(iF.apply(20));
        LongFunction<Integer> lF = a -> Integer.valueOf(String.valueOf(a));  // input primitive return object
        System.out.println(lF.apply(20l));
        ToLongFunction<Integer> toL = a -> Long.valueOf(a);
        System.out.println(toL.applyAsLong(123));
        ToLongBiFunction<Long, Integer> toL2 = (a,b) -> a+b;  // output primitive input object
        System.out.println(toL2.applyAsLong(12l, 12));
        IntToDoubleFunction inToD = (a) -> Double.valueOf(a);  // input, output  primitve
        System.out.println(inToD.applyAsDouble(25));




    }
}
