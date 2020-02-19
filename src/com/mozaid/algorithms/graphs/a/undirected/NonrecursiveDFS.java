package com.mozaid.algorithms.graphs.a.undirected;

import com.mozaid.algorithms.stackqueue.ResizingArrayStack;
import com.mozaid.algorithms.stackqueue.Stack;

public class NonrecursiveDFS {

    private boolean[] marked;

    public NonrecursiveDFS(Graph G, int s) {
        marked = new boolean[G.V()];

        Stack<Integer> vertices = new ResizingArrayStack<>();
        vertices.push(s);

        while (!vertices.isEmpty()) {
            int v = vertices.pop();
            marked[v] = true;
            for (int w : G.adj(v)) {
                if (!marked[w]) {
                    vertices.push(w);
                }
            }
        }
    }

}
