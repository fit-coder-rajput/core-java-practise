import java.util.function.BinaryOperator;

public class BinaryOperatorF {
    public static void main(String[] args) {
        BinaryOperator<Integer> binOp = (a,b) -> b-a;
        System.out.println(binOp.apply(10, 5));

        BinaryOperator<Integer> maxm = BinaryOperator.maxBy((a,b) -> a>b?a:(a==b?0:-1));

        BinaryOperator<Integer> minm = BinaryOperator.minBy((a,b)->a>b?1:(a==b?0:-1));

        System.out.println(maxm.apply(16, 20) +" is greater");
        System.out.println(minm.apply(16, 20)+" is smaller");
    }
}
