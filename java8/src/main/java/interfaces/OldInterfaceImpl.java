package main.java.interfaces;

public class OldInterfaceImpl implements MyOldInterface {
    @Override
    public void someMethod() {
        System.out.println("Some Old Method");
    }

    public void someOtherMethod() {
        System.out.println("Some other method");
    }
}
