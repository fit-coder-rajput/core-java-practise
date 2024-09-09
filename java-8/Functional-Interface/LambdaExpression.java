
/**
 * InnerLambdaExpression
 */
@FunctionalInterface
 interface InnerLambdaExpression {
  
    public void print();    
}

@FunctionalInterface
 interface InnerLambdaExpression2 {
  
    public void print(String val);    
}
class LambdaExpression{
    public static void main(String[] args) {

        InnerLambdaExpression method1 = () -> System.out.println("calling from reference 1");
        InnerLambdaExpression method2 = () -> System.out.println("calling from reference 2");

        method1.print();
        method2.print();

        InnerLambdaExpression2 method3 = (name) -> System.out.println("calling from reference 3 wtih param: "+name);
        method3.print("dhruv");

    }
}