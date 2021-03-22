package main.java.factory;

public class AnimalFactory {

  public static Animal getInstance(
      boolean mammal, int legsCount, boolean climbTrees, boolean swims) {
    if (mammal && legsCount == 2 && climbTrees && !swims) {
      return new Monkey();
    }
    if (mammal && legsCount == 4 && !climbTrees && !swims) {
      return new Cow();
    }
    if (!mammal && legsCount == 2 && !climbTrees && !swims) {
      return new Hen();
    }
    return null;
  }
}
