package main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SingleUseStream {
  public static void main(String[] args) {
    List<Integer> data = new ArrayList<>(Arrays.asList(5, 3, 4, 10, 1, 15));
    Stream<Integer> myStream = data.stream();

    System.out.println("First Stream");
    myStream.forEach(System.out::println);

    System.out.println("Second Stream");
    myStream.forEach(System.out::println);
  }
}
