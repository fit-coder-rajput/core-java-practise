import java.util.function.Function;

public class FunctionInterface {
    public static void main(String[] args) {
        
        Function<String, Integer> getStringLen = (s) -> {System.out.println("getString");      return s.length();};   // take input of type T return type R
        Function<Integer, Integer> doubleTheLength = (l) ->{System.out.println("multiply by 2"); return 2*l;};

        Function<String, Integer> composeFunction = doubleTheLength.compose(getStringLen);


        Function<String, Integer> ansThen = getStringLen.andThen(doubleTheLength);
        // compose

        System.out.println(composeFunction.apply("dhruv"));
        System.out.println(ansThen.apply("dhruv"));


        // andThen

        


    }
}
