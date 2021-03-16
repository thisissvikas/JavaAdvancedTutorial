package main.java.forEach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachDemo {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(5, 3, 4, 10, 1, 15));

        Consumer<Integer> consumer = integer -> System.out.println(integer);
        data.forEach(consumer);

        Consumer<Integer> consumer2 = System.out::println;
        data.forEach(consumer2);

        data.forEach(a -> {
            System.out.println(a);
            System.out.println(Math.pow(a, 2));
        });

        data.forEach(System.out::println);
    }
}
