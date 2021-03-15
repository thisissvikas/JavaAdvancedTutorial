package main.java.functional_interface;

public class WhyFunctionalInterface {

    public static void main(String[] args) {
        MyFuncInterface myFuncInterface = () -> System.out.println("Inline Impl");
        myFuncInterface.myMethod();
        myFuncInterface.method2();
    }
}
