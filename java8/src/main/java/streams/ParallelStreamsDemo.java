package main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ParallelStreamsDemo {
  public static void main(String[] args) {
    List<Integer> data =
        new ArrayList<>(Arrays.asList(5, 3, 4, 10, 1, 15, 5, 3, 4, 10, 1, 15, 5, 3, 4, 10, 1, 15));

    data.parallelStream().forEach(System.out::println);

    data.parallelStream()
            .filter(i -> i < 10)
            .map(i -> i * 2)
            .filter(i -> i < 10)
            .forEach(System.out::println);
  }
}
