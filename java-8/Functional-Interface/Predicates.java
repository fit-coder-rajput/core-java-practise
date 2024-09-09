import java.util.function.Predicate;

/**
 * InnerPredicates
 */
 interface CustomPredicate<T> extends Predicate<T> {
    boolean test(T x);

    default CustomPredicate<T> and(CustomPredicate<T> greaterThan50){

          return (t)-> this.test(t)   &&    greaterThan50.test(t);
    }

    default CustomPredicate<T> negate(){
        return (t) -> !test(t);
    }
    
}
public class Predicates {
    public static void main(String[] args) {
        

        CustomPredicate<Integer> isEven = (x) -> x%2 == 0;
        CustomPredicate<Integer> greaterThan50 = x -> x>50;
        isEven.test(60); // predicate 1
        greaterThan50.test(60); // predicate 2

        CustomPredicate<Integer> chainPredicate = isEven.and(greaterThan50);

        System.out.println(chainPredicate.test(60));
        System.out.println( isEven.test(60) &&  greaterThan50.test(60));

       System.out.println("if even then false 50 is :" +isEven.negate().test(50));
    }
}
