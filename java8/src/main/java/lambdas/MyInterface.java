package main.java.lambdas;

@FunctionalInterface
public interface MyInterface {
    void someMethod();

    default void someDefaultMethod() {
        System.out.println("I am a default method");
    }
}
