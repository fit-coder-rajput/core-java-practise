import java.util.function.BiPredicate;

public class BiPredicatesF {
    public static void main(String[] args) {
        
        BiPredicate<Integer,Integer> bip = (a,b) -> a%2==0 && b%2==0;
        System.out.println(bip.test(6,8));

    }
}
