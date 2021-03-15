package main.java.interfaces;

public interface MyNewInterface {
    void newMethod();

    default void anotherNewMethod() {
        System.out.println("If you don't override, I will be here");
    }
}
