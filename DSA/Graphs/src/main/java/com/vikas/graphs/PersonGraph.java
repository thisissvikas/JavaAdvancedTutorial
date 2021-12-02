package com.vikas.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonGraph {

  private Map<PersonVertex, List<PersonVertex>> adjacentPersonVertices;

  public PersonGraph() {
    this.adjacentPersonVertices = new HashMap<>();
  }

  public Map<PersonVertex, List<PersonVertex>> getAdjacentPersonVertices() {
    return adjacentPersonVertices;
  }

  public void setAdjacentPersonVertices(
      Map<PersonVertex, List<PersonVertex>> adjacentPersonVertices) {
    this.adjacentPersonVertices = adjacentPersonVertices;
  }

  public void addVertex(String name) {
    adjacentPersonVertices.putIfAbsent(new PersonVertex(name), new ArrayList<>());
  }

  public void removeVertex(String name) {
    adjacentPersonVertices.values().forEach(edges -> edges.remove(new PersonVertex(name)));
    adjacentPersonVertices.remove(new PersonVertex(name));
  }

  public void addEdge(String name1, String name2) {
    adjacentPersonVertices.get(new PersonVertex(name1)).add(new PersonVertex(name2));
    adjacentPersonVertices.get(new PersonVertex(name2)).add(new PersonVertex(name1));
  }

  public void removeEdge(String name1, String name2) {
    adjacentPersonVertices.get(new PersonVertex(name1)).remove(new PersonVertex(name2));
    adjacentPersonVertices.get(new PersonVertex(name2)).remove(new PersonVertex(name1));
  }

  public List<PersonVertex> getAdjacentVertices(String name) {
    return adjacentPersonVertices.get(new PersonVertex(name));
  }
}
