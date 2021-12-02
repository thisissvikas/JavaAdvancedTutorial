package com.vikas.graphs;

import java.util.*;

public class GraphTraverser {
  public static Set<String> depthFirstTraversal(PersonGraph graph, String root) {
    Set<String> visited = new LinkedHashSet<>();
    Stack<String> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
      String vertex = stack.pop();
      if (!visited.contains(vertex)) {
        visited.add(vertex);
        for (PersonVertex v : graph.getAdjacentVertices(vertex)) {
          stack.push(v.getName());
        }
      }
    }
    return visited;
  }

  public static Set<String> breadthFirstTraversal(PersonGraph graph, String root) {
    Set<String> visited = new LinkedHashSet<>();
    Queue<String> queue = new LinkedList<>();
    queue.add(root);
    visited.add(root);
    while (!queue.isEmpty()) {
      String vertex = queue.poll();
      for (PersonVertex v : graph.getAdjacentVertices(vertex)) {
        if (!visited.contains(v.getName())) {
          visited.add(v.getName());
          queue.add(v.getName());
        }
      }
    }
    return visited;
  }
}
