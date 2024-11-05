package com.juseungl.codingtestwithjava.BfsDfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProgrammersBfs2 {

    public boolean[] bfs(boolean[] visited, List<List<Integer>> graph, int start) {

        Queue<Integer> q = new LinkedList<>();
        q.add(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            Integer node = q.poll();
            for (int edge:graph.get(node)) {
                if (visited[edge] == false) {
                    q.add(edge);
                    visited[edge] = true;
                }
            }
        }
        return visited;
    }
    public int solution(int n, int[][] computers) {
        int answer = 0;
//        Boolean[] visited = new Boolean[n]; // 기본 값 Null
        boolean[] visited = new boolean[n]; // 기본 값 false

        List<List<Integer>> graph = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>()); // 각 노드에 빈 리스트 추가
        }

        for (int i = 0; i < n; i++) {
            int[] computer = computers[i];
            for (int j = 0; j < n; j++){
                if ((computer[j] == 1) && (i != j)) {
                    graph.get(i).add(j);
                }
            }
        }

        for (int i = 0; i < n;i++) {
            System.out.println("--------------------");
            if (visited[i] == false) {
                visited = bfs(visited, graph, i);
                answer ++;
            }

        }

        return answer;
    }
}
