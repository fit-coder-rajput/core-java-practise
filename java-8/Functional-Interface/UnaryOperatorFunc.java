import java.util.function.UnaryOperator;

public class UnaryOperatorFunc {
    public static void main(String[] args) {
        UnaryOperator<Integer> up = (x) -> Math.abs(x);
        System.out.println(up.apply(-5));

        // UnaryOperator is child of Function functional interface 
        // Function<Integer, Integer>  == UnaryOperator<Integer>
    }
}
