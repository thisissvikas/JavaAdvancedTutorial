package main.java.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComplexOperations {
  public static void main(String[] args) {
    Student student1 = new Student(10, "Vikas");
    Student student2 = new Student(15, "ShuuG");
    Student student3 = new Student(20, "Kaa");
    Student student4 = new Student(25, "Halwa");
    Student student5 = new Student(100, "Mera");
    List<Student> students = new ArrayList<>();
    students.add(student1);
    students.add(student2);
    students.add(student3);
    students.add(student4);
    students.add(student5);

    System.out.println("Use case 1");
    students.stream().forEach(s -> System.out.println(s.getName()));
    students.stream().forEach(s -> System.out.println(s.getAge()));
    students.stream().forEach(s -> System.out.println(s.toString()));

    System.out.println("Use case 2");
    students.stream().filter(s -> s.getAge() > 40).forEach(System.out::println);

    System.out.println("Use case 3");
    List<String> names = students.stream().map(Student::getName).collect(Collectors.toList());
    names.forEach(System.out::println);

    System.out.println("Use case 4");
    students.stream()
        .filter(student -> student.getAge() > 20)
        .filter(student -> student.getName().startsWith("M"))
        .forEach(System.out::println);

    System.out.println("Use case 5");
    students.stream()
        .filter(student -> student.getAge() > 20)
        .filter(student -> student.getName().startsWith("M"))
        .skip(1)
        .forEach(System.out::println);

    System.out.println("Use case 2");
//    students.forEach(System.out::println);
    students.parallelStream().forEach(System.out::println);
  }
}
