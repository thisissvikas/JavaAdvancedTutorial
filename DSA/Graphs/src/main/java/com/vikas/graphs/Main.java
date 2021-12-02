package com.vikas.graphs;

public class Main {
  public static void main(String[] args) {
    PersonGraph graph = new PersonGraph();
    graph.addVertex("Bob");
    graph.addVertex("Alice");
    graph.addVertex("Mark");
    graph.addVertex("Rob");
    graph.addVertex("Maria");
    graph.addEdge("Bob", "Alice");
    graph.addEdge("Bob", "Rob");
    graph.addEdge("Alice", "Mark");
    graph.addEdge("Rob", "Mark");
    graph.addEdge("Alice", "Maria");
    graph.addEdge("Rob", "Maria");

//    GraphTraverser.depthFirstTraversal(graph, "Bob").forEach(System.out::println);
    GraphTraverser.breadthFirstTraversal(graph, "Bob").forEach(System.out::println);
  }
}
