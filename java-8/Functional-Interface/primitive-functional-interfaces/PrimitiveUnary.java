import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.LongUnaryOperator;

public class PrimitiveUnary {
    public static void main(String[] args) {
        IntUnaryOperator iup = x -> x-1;  // input and output primitive
        LongUnaryOperator lup = x -> x+1;

        System.out.println(iup.applyAsInt(20));


        IntBinaryOperator biup = (a,b) -> a*b;  // input and output of same type 
        System.out.println(biup.applyAsInt(23, 23));


    }
}
