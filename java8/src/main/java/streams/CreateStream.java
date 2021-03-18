package main.java.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStream {
    public static void main(String[] args) {
        Stream<String> myStream = Stream.empty();

        List<String> data = new ArrayList<>(Arrays.asList("abc", "def"));
        Stream<String> dataStream = data.stream();

        Stream<String> arrayStream = Stream.of("abc", "def");
    }
}
