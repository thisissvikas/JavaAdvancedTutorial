package main.java.functional_interface;

import java.util.concurrent.Callable;

@FunctionalInterface
public interface MyFuncInterface {
    void myMethod();

    default void method2() {
        System.out.println("Some method");
    }

    static void method3() {
        System.out.println("Some method");
    }
}
