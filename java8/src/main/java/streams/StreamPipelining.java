package main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamPipelining {
  public static void main(String[] args) {
    /// data -> filter(optional) -> filter -> map(optional) -> reduce
    List<Integer> data = new ArrayList<>(Arrays.asList(5, 3, 4, 10, 1, 15));

    System.out.println("Stream 1");
    data.stream().forEach(System.out::println);

    System.out.println("Stream 2");
    data.stream().filter(i -> i < 10).forEach(System.out::println);

    System.out.println("Stream 3");
    data.stream().filter(i -> i < 10).filter(i -> i % 2 == 0).forEach(System.out::println);

    System.out.println("Stream 4");
    data.stream().map(i -> i * 2).forEach(System.out::println);

    System.out.println("Stream 5");
    data.stream()
        .filter(i -> i < 10)
        .map(i -> i * 2)
        .filter(i -> i < 10)
        .forEach(System.out::println);

    System.out.println("Stream 6");
    List<Integer> finalData =
        data.stream()
            .filter(i -> i < 10)
            .map(i -> i * 2)
            .filter(i -> i < 10)
            .collect(Collectors.toList());

    System.out.println("Stream 7");
    long count = data.stream().filter(i -> i < 10).filter(i -> i > 5).count();

    System.out.println("Stream 8");
    List<Integer> newData = new ArrayList<>(Arrays.asList(5, 3, 4, 10, 1, 15));
    data.stream().skip(1).forEach(System.out::println);
  }
}
