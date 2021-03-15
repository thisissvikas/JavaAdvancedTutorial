package main.java.functional_interface;

public interface NormalInterface {

    void method1();

    void method2();

    default void method3() {
        System.out.println("Some method");
    }

    static void method4() {
        System.out.println("Some method");
    }
}
