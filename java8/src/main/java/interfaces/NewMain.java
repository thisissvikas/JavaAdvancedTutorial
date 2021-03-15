package main.java.interfaces;

import java.util.List;

public class NewMain {
    public static void main(String[] args) {
        MyNewInterface newInterface = new NewInterfaceImpl();
        newInterface.newMethod();
        newInterface.anotherNewMethod();

        MyNewInterface newInterface2 = new MyNewInterfaceImpl();
        newInterface2.newMethod();
        newInterface2.anotherNewMethod();
    }
}
