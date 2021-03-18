package main.java.streams;

import java.util.stream.IntStream;

public class OtherStreams {
  public static void main(String[] args) {
    IntStream myIntStream = IntStream.of(10, 20, 30, 40, 50);

    IntStream myIntStream2 = IntStream.range(1, 100);
    myIntStream2.forEach(System.out::println);

    IntStream myIntStream3 = IntStream.range(1, 100);
    System.out.println("Sum = " + myIntStream3.sum());
  }
}
