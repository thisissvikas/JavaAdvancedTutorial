package com.vikas.graphs;

import java.util.Objects;

public class PersonVertex {
  private final String name;

  PersonVertex(String name) {
    this.name = name;
  }

  public String getName(){
    return name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PersonVertex that = (PersonVertex) o;
    return Objects.equals(name, that.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name);
  }
}
