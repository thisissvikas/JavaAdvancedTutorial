package main.java.functional_interface;

public class AnonymousImpl {
    public static void main(String[] args) {

        MyFuncInterface myFuncInterface = new MyFuncInterface() {
            @Override
            public void myMethod() {
                System.out.println("Inline Impl");
            }
        };

        NormalInterface normalInterface = new NormalInterface() {
            @Override
            public void method1() {
                System.out.println("Inline Impl 1");
            }

            @Override
            public void method2() {
                System.out.println("Inline Impl 2");
            }
        };

        myFuncInterface.myMethod();
        normalInterface.method2();
        normalInterface.method3();
    }
}
