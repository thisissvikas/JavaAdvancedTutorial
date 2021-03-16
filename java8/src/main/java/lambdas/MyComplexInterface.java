package main.java.lambdas;

@FunctionalInterface
public interface MyComplexInterface {
    void someMethod(int a, int b);

    default void someDefaultMethod() {
        System.out.println("I am a default method");
    }
}
