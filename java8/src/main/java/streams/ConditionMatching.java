package main.java.streams;

import java.util.stream.Stream;

public class ConditionMatching {
  public static void main(String[] args) {
    boolean value = Stream.of(10, 20, 30, 40, 50).allMatch(n -> n > 20);
    System.out.println(value);

    boolean value2 = Stream.of(10, 20, 30, 40, 50).noneMatch(n -> n > 20);
    System.out.println(value2);
  }
}
