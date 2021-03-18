package main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasicStreams {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(5, 3, 4, 10, 1, 15));

        data.forEach(d -> {
            if (d >= 10){
                System.out.println(d);
            }
        });

        data.stream().filter(i -> i >= 10).forEach(System.out::println);
    }
}
