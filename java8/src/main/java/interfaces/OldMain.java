package main.java.interfaces;

public class OldMain {
    public static void main(String[] args) {
        OldInterfaceImpl oldInterface = new OldInterfaceImpl();
        oldInterface.someMethod();
        oldInterface.someOtherMethod();

        MyOldInterface oldInterface1 = new OldInterfaceImpl();
        oldInterface1.someMethod();
        if(oldInterface1 instanceof OldInterfaceImpl) {
            ((OldInterfaceImpl) oldInterface1).someOtherMethod();
        }
    }
}
