package main.java.factory;

public class Consumer {
  public static void main(String[] args) {
    makeSound(true, 4, false, false);
    makeSound(true, 2, true, false);
    makeSound(false, 2, false, false);
  }

  public static void makeSound(boolean mammal, int legsCount, boolean climbTrees, boolean swims) {
    Animal animal = AnimalFactory.getInstance(mammal, legsCount, climbTrees, swims);
    if (animal != null) {
      animal.makeSound();
    } else {
      System.out.println("No Animal Found with given features");
    }
  }
}
