package main.java.lambdas;

public class MyMain {
    public static void main(String[] args) {
        MyInterface myInterface = () -> System.out.println("I am lambda");
        myInterface.someMethod();
        myInterface.someDefaultMethod();

        MyComplexInterface myComplexInterface = (a, b) -> System.out.println("I am also lambda : " + (a + b));
        myComplexInterface.someMethod(2, 3);

        MyInterfaceSingleParam myInterfaceSingleParam = a -> System.out.println("I am also lambda " + a);
        myInterfaceSingleParam.someMethod("Vikas");

        MyInterfaceComplexImpl myInterfaceComplex = (a, b) -> {
            int max = Math.max(a, b);
            System.out.println("I am also lambda " + max);
        };
        myInterfaceComplex.someMethod(10, 5);


        MyInterfaceWithAReturn myInterfaceWithAReturn = (a, b) -> {
            int max = Math.max(a, b);
            return max;
        };
        System.out.println("Max is : " + myInterfaceWithAReturn.someMethod(5, 10));

        MyInterfaceWithAReturn myInterfaceWithAReturn2 = (a, b) -> Math.max(a, b);
        System.out.println("Max is : " + myInterfaceWithAReturn2.someMethod(5, 10));
    }
}
