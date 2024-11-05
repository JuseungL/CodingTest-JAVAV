package com.juseungl.codingtestwithjava.BruteForce;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ProgrammersBF6 {
    /**
     * BFS를 이용해 전력망 분할 문제를 해결합니다.
     */
    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;

        // 그래프 초기화
        List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        // 양방향 간선 구조 설정
        for (int[] wire : wires) {
            graph.get(wire[0]).add(wire[1]);
            graph.get(wire[1]).add(wire[0]);
        }

        // 각 간선을 하나씩 제거하여 전력망을 두 개로 나눠봅니다.
        for (int[] wire : wires) {
            // wire 하나의 양 끝에 연결된 노드들
            int node1 = wire[0];
            int node2 = wire[1];

            // 간선 제거
            graph.get(node1).remove((Integer) node2);
            graph.get(node2).remove((Integer) node1);

            // BFS를 통해 두 전력망의 노드 개수를 계산
            int count1 = bfs(graph, node1, n);
            int count2 = n - count1;

            // 두 전력망의 차이의 최솟값을 구함
            answer = Math.min(answer, Math.abs(count1 - count2));

            // 간선 복구
            graph.get(node1).add(node2);
            graph.get(node2).add(node1);
        }

        return answer;
    }

    // BFS를 사용하여 노드 개수 계산
    private int bfs(List<List<Integer>> graph, int start, int n) {
        boolean[] visited = new boolean[n + 1];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        int count = 1;

        while (!queue.isEmpty()) {
            int node = queue.poll();
            for (int neighbor : graph.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                    count++;
                }
            }
        }

        return count;
    }
}
